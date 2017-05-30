/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 *
 * @author PNattawut
 */
@Aspect
public class AspectAccount {
    
    @Before("execution(*  com.spring.model.Account.*(..))")
    public void printBeforeExecution(JoinPoint joinPoint){
        for(Object o : joinPoint.getArgs()){
            System.out.println(">> "+o.toString());
        }
    }
}
