package edu.miu.aspect;

import edu.miu.exception.AopIsAwesomeHeaderException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class HeaderAspect {
    final HttpServletRequest httpServletRequest;

    public HeaderAspect(HttpServletRequest httpServletRequest) {
        this.httpServletRequest = httpServletRequest;
    }

    @Pointcut("within(edu.miu.service.impl.*)")
    public void allServiceMethodsPointcut() {}

    @Around("allServiceMethodsPointcut()")
    public Object allServiceMethodsAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        var result = proceedingJoinPoint.proceed();
        if (httpServletRequest.getMethod().equalsIgnoreCase("post")) {
            if (httpServletRequest.getHeader("AOP-IS-AWESOME") == null) {
                throw new AopIsAwesomeHeaderException(proceedingJoinPoint.getSignature().getName() + " is missing AOP-IS-AWESOME header");
            } else {
                return result;
            }
        }

        return result;
    }
}
