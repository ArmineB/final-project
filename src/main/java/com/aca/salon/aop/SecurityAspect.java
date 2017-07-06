package com.aca.salon.aop;


import com.aca.salon.dao.SessionDao;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

/**
 * Created by Armine on 13/06/2017.
 */
@Aspect
@Component
public class SecurityAspect {

    private final SessionDao sessionDao;

    @Autowired
    public SecurityAspect(SessionDao sessionDao) {
        this.sessionDao = sessionDao;
    }

    @Around("execution(org.springframework.http.ResponseEntity com.aca.salon.controller.SalonRestController.*(..))")
    public ResponseEntity<String> foo(ProceedingJoinPoint joinPoint) throws Throwable {
        Object[] args = joinPoint.getArgs();
        String authToken = (String) args[0];

        if(!sessionDao.isAuthorized(authToken)){
            return new ResponseEntity<String>(HttpStatus.FORBIDDEN);
        }

        @SuppressWarnings("unchecked")
        ResponseEntity<String> response = (ResponseEntity<String>) joinPoint.proceed();

        System.out.println(response);

        return response;
    }
}