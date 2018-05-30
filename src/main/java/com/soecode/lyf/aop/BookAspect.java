package com.soecode.lyf.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

/**
 * user:hudawei1
 * date:2018/5/29
 * time:20:45
 */
@Aspect
@Component
public class BookAspect {


    @Pointcut(value="execution(* com.soecode.lyf.service.BookService.getById(..))")
    public void point(){

    }

//    @Before(value="point()")
//    public void before(){
//        System.out.println("before is running");
//    }
//
//    @After(value = "point()")
//    public void after(){
//        System.out.println("after is running");
//    }

    /**
     * 一般使用around，其它方法和around冲突。
     * @param joinPoint
     * @return
     * @throws Throwable
     */
    @Around("point()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("around before is running");
        Object obj = null;
        try{
            obj = joinPoint.proceed();
        }catch (Exception e){
            System.out.println("around Throwing is running. +异常为:" + e);
            throw e;
        }
        System.out.println("around after is running");
        return obj;

    }

//    @AfterReturning(value = "point()",returning="resultMap")
//    public void afterReturning(JoinPoint joinpoint, Object resultMap) throws Throwable {
//        System.out.println("afterReturning is running");
//    }
//
//    @AfterThrowing(pointcut = "point()", throwing = "e")
//    public void afterThrowing(JoinPoint joinpoint, Throwable e) {
//        System.out.println("afterThrowing is running. +异常为:" + e);
//    }

}
