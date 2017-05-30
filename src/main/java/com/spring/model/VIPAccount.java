/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.model;

/**
 *
 * @author PNattawut
 */
public class VIPAccount extends Account{

    private String coupon;
    public String getCoupon() {
        return coupon;
    }

    public void setCoupon(String coupon) {
        this.coupon = coupon;
    }

    @Override
    public String toString() {
        return super.toString()+" VIPAccount{" + "coupon=" + coupon + '}';
    }

   

    
}
