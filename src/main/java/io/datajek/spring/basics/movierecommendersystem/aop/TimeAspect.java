package io.datajek.spring.basics.movierecommendersystem.aop;

import jakarta.persistence.JoinTable;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class TimeAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Around(
            value = "execution(* io.datajek.spring.basics.movierecommendersystem.aop.*.*Filtering(..))"
    )
    public Object computeExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable{
        long startTime = System.currentTimeMillis();

        Object returnObj = joinPoint.proceed();

        long execTime = System.currentTimeMillis() - startTime;
        logger.info("Execution Time = {}", execTime);

        return returnObj;
    }
}
