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
public class FibonacciProgression extends AbstractProgression {
    
    protected long prev;
    
    public FibonacciProgression() {
        this(0, 1);
    }
    
    public FibonacciProgression(long first, long second) {
         super(first);
         prev = second - first;
    }
    
    protected void advance() {
        long temp = prev;
        prev = current;
        current += temp;
    }
    
}
