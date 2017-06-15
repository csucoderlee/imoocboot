package com.csu.coderlee.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by lixiang on 2017 06 15 下午11:26.
 */

@Aspect
@Component
public class HttpAspect {

    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

//    @Before("execution(public * com.csu.coderlee.controller.BoyController.*(..))")
//    public void doBefore() {
//        System.out.println("aspect");
//    }
//
//    @After("execution(public * com.csu.coderlee.controller.BoyController.*(..))")
//    public void doAfter() {
//        System.out.println("aspect");
//    }

    @Pointcut("execution(public * com.csu.coderlee.controller.BoyController.*(..))")
    public void log() {

    }

    @Before("log()")
    public void doBefore() {
        logger.info("before");
        System.out.println("aspect");

        //url

        //method

        //ip

        //类方法


    }

    @After("log()")
    public void doAfter() {
        logger.info("after");
        System.out.println("aspect");
    }


}
