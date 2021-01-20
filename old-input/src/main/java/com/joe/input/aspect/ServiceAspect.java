package com.joe.input.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.awt.*;

/**
 * 日志切面
 *
 * @author Joe
 * @since 2021/1/18 13:17
 */
@Aspect
@Component
public class ServiceAspect {
    private static final Logger log = LoggerFactory.getLogger(ServiceAspect.class);

    @Pointcut("execution(* com.joe.input.service.DataInputJobsService.*(..))")
    private void eachTimePointcut() {
    }

    @Around("eachTimePointcut()")
    public Object eachTimeAroundService(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        log.info("===> " + joinPoint.getSignature().getName() + " start");
        try {
            Object result = joinPoint.proceed();
            long end = System.currentTimeMillis();
            String msg = (String) result;
            if (msg.length() == 0) {
                log.info("===> " + joinPoint.getSignature().getName() + " Use time : " + (end - start) + " ms!");
            } else {
                log.error("===> " + joinPoint.getSignature().getName() + " Use time : " + (end - start) + " ms!\t with error message : \n\t " + msg);
            }
            return result;
        } catch (Throwable e) {
            long end = System.currentTimeMillis();
            log.error("===> " + joinPoint.getSignature().getName() + " Use time : " + (end - start) + " m xs with exception : " + e.getMessage());
            throw e;
        }
    }
}
