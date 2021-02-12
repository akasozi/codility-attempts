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
public abstract class AbstractProgression {
    
    protected long current;
    
    public AbstractProgression() {
       this(0);
    }
    
    public AbstractProgression(long start) {
         current = start;
    }
    
    protected abstract void advance();
    
    public long nextValue() {
        long answer = current;
        advance();
        return answer;
    }
    
    public void printProgression(int n) {
        System.out.print(nextValue());
        for (int j = 1; j < n; j++) {
             System.out.print(" " + nextValue());
        }
        System.out.println();
    }
}
