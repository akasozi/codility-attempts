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
public class ArithmeticProgression extends AbstractProgression {
    
    protected long increment;
    
    public ArithmeticProgression() {
       this(1, 0);
    }
    
    public ArithmeticProgression(long stepsize) {
       this(stepsize, 0);
    }
    
    public ArithmeticProgression(long stepsize, long start) {
       super(start);
       increment = stepsize;
    }
    
    protected void advance() {
        current += increment;
    }
}
