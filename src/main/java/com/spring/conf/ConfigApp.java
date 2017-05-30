/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.conf;

import com.spring.model.Account;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author PNattawut
 */

@Configuration
public class ConfigApp {

   @Bean
   public Account account(){
       Account acc = new Account();
       acc.setId(321321);
       acc.setName("ObjectTest");
       return acc;
   }
   
}
