/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.main;

import com.spring.conf.ConfigApp;
import com.spring.model.Account;
import com.spring.model.VIPAccount;
import javafx.application.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author PNattawut
 */
public class Main {

    
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

//        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class);
        Account acc = context.getBean(Account.class);
        acc.setId(0);
        acc.setBal(222);
        acc.setName("<LASF");
        System.out.println(acc.toString());
//        Account acc2 = (Account)context.getBean("acc");
//        System.out.println(acc2.toString());
//        VIPAccount vipAcc = (VIPAccount)context.getBean("vipacc");
//        System.out.println(vipAcc.toString());
    }
}
