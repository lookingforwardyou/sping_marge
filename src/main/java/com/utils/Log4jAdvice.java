package com.utils;

import com.controller.WareController;
import com.dao.WareMapper;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;



@Component
@Aspect
public class Log4jAdvice {

    Logger logger=Logger.getLogger(WareController.class);
    String strLog = null ;

    @Pointcut("execution(* com.dao.WareMapper.*(..))")
    public void sayHi(){}

    @Before("sayHi()")
    public void before(JoinPoint jp){
        strLog ="before:log Begining method: "
                + jp.getTarget().getClass().getName() + "."
                + jp.getSignature().getName();
        logger.warn(strLog);
    }
    @Around("sayHi()")//此方法要有返回值，不然切面函数的返回值会变成空
    public Object around(ProceedingJoinPoint pjp){
        long time = System.currentTimeMillis();
        Object ob=null;
        try {
            ob=pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        time = System.currentTimeMillis() - time;
        System.out.println("process time: " + time + " ms");
        return ob;
    }
    @After("sayHi()")
    public void after(JoinPoint jp){
        strLog ="after:log Ending method: "
                + jp.getTarget().getClass().getName() + "."
                + jp.getSignature().getName();
        logger.warn(strLog);
    }
}
