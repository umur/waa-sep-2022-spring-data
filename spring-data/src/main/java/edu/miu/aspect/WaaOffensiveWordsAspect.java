package edu.miu.aspect;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.miu.entity.OffensiveWordsLog;
import edu.miu.entity.User;
import edu.miu.repo.OffensiveWordsLogRepo;
import edu.miu.security.impl.AuthenticationFacadeImpl;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import org.springframework.util.StreamUtils;

import javax.servlet.http.HttpServletRequest;
import java.time.Duration;
import java.time.Instant;
import java.util.Map;

@Aspect
@Component
public class WaaOffensiveWordsAspect {
    private final HttpServletRequest httpServletRequest;
    private final AuthenticationFacadeImpl authenticationFacade;
    private final OffensiveWordsLogRepo offensiveWordsLogRepo;
    private final static String OFFENSIVE_WORD = "spring";

    public WaaOffensiveWordsAspect(HttpServletRequest httpServletRequest, AuthenticationFacadeImpl authenticationFacade, OffensiveWordsLogRepo offensiveWordsLogRepo) {
        this.httpServletRequest = httpServletRequest;
        this.authenticationFacade = authenticationFacade;
        this.offensiveWordsLogRepo = offensiveWordsLogRepo;
    }

    @Pointcut("within(edu.miu.service.impl.*)")
    public void allServiceMethodsPointcut() {}

    @Around("allServiceMethodsPointcut()")
    public Object allServiceMethodsAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        var result = proceedingJoinPoint.proceed();

        byte[] inputStreamBytes = StreamUtils.copyToByteArray(httpServletRequest.getInputStream());
        Map<String, String> jsonRequest = new ObjectMapper().readValue(inputStreamBytes, Map.class);

        String requestBodyJsonString = jsonRequest.get("body");

        if (requestBodyJsonString.toLowerCase().contains(OFFENSIVE_WORD)) {
            Authentication authentication = authenticationFacade.getAuthentication();
            User user = (User) authentication.getDetails();

            OffensiveWordsLog offensiveWordsLog = offensiveWordsLogRepo.findOffensiveWordsLogByUserId(user.getId());

            if (offensiveWordsLog != null) {
                long timeElapsed = Duration.between(offensiveWordsLog.getUpdatedAt(),Instant.now()).toMinutes();
                int requestCount = offensiveWordsLog.getRequestCount();

                
            }

            requestBodyJsonString.toLowerCase().replaceAll(OFFENSIVE_WORD, "******");
        }

        return result;
    }
}
