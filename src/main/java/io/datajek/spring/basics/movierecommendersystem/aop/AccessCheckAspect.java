package io.datajek.spring.basics.movierecommendersystem.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AccessCheckAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before("execution(* io.datajek.spring.basics.movierecommendersystem.aop.*.contentBasedFiltering(..))")
    public void userAccess(JoinPoint joinPoint){
        logger.info("userAccess : Checking User Accessebility : {}", joinPoint);
    }

}
