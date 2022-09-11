package edu.miu.aspect;

import edu.miu.entity.ActivityLog;
import edu.miu.repo.ActivityLogRepo;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Aspect
@Component
public class ExecutionTimeAspect {
    private final ActivityLogRepo activityLogRepo;

    public ExecutionTimeAspect(ActivityLogRepo activityLogRepo) {
        this.activityLogRepo = activityLogRepo;
    }

    @Pointcut("@annotation(edu.miu.annotation.ExecutionTime)")
    public void logExecutionTimePointcut() { /* Pointcut expression method */ }

    @Around("logExecutionTimePointcut()")
    public Object logExecutionTimeAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.nanoTime();
        var res = joinPoint.proceed();
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);

        activityLogRepo.save(new ActivityLog(LocalDate.now(), joinPoint.getSignature().getName(), duration));
        return res;
    }
}
