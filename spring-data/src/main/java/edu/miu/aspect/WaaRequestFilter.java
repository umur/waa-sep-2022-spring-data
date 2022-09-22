package edu.miu.aspect;

import edu.miu.repo.OffensiveWordsLogRepo;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class WaaRequestFilter {
    private final OffensiveWordsLogRepo offensiveWordsLogRepo;

    public WaaRequestFilter(OffensiveWordsLogRepo offensiveWordsLogRepo) {
        this.offensiveWordsLogRepo = offensiveWordsLogRepo;
    }

    @Pointcut("within(edu.miu.service.impl.*)")
    public void allServiceMethodsPointcut() {}

    @Around("allServiceMethodsPointcut()")
    public Object allServiceMethodsAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        var result = proceedingJoinPoint.proceed();



        return result;
    }
}
