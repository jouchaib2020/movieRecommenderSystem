package io.datajek.spring.basics.movierecommendersystem.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class LoggingAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @AfterReturning(
            value = "execution(* io.datajek.spring.basics.movierecommendersystem.aop.*.collaborativeFiltering(..))",
            returning = "req"
    )
    public void log(JoinPoint joinPoint, Object req){
        logger.info("LoggingAspect :{}, result = {}", joinPoint, req);
    }
}
