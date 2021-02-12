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
public class GeometricProgression extends AbstractProgression {
    
    protected long base;
    
    
    public GeometricProgression() {
        this(2);
    }
    
    public GeometricProgression(long b) {
        this(b, 1);
    }
    
    public GeometricProgression(long b, long start) {
         super(start);
         base = b;
    }
    
    protected void advance() {
        current *= base;
    }
}
