/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datastructures.chapt02;

/**
 *
 * @author abubizibu
 */
public class PredatoryCreditCard extends CreditCard {
    
    private double apr; // annual percentage rate
    
    public PredatoryCreditCard(String customer, String bank, String account, int limit, double initialBalance, double rate) {
        super(customer, bank, account, limit, initialBalance);
        apr = rate;
    }
    
    // A new method for assessing the monthly interest date
    public void processMonth() {
        if (balance > 0) {
           double monthlyFactor = Math.pow(1 + apr, 1.0/12);
           balance *= monthlyFactor;
        }
    }
    
    public boolean charge(double price) {
       boolean isSuccess = super.charge(price);
       if (!isSuccess)
           balance += 5;
       return isSuccess;
    }
}
