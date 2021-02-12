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
public class Progression {
    
    protected long current;
    
    public Progression() {
       this(0);
    }
    
    public Progression(long start) {
       current = start;
    }
    
    public long nextValue() {
       long answer = current;
       advance();
       return answer;
    }
    
    protected void advance() {
       current++;
    }
    
    
    public void printProgression(int n) {
        // Long.MAX_VALUE
        System.out.print(nextValue());
        for (int j = 1; j < n; j++) {
            if (j < Long.MAX_VALUE)
              System.out.print(" " + nextValue());
            else {
               System.out.println("Overflow at: " + n);
               break;
            }
                ;
        }
        System.out.println();
    } 
    
   
}
