/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datastructures.counter;

/**
 *
 * @author abubizibu
 */
public class Counter {
    // simple instance variable
    private int count;
    
    // default constuctor
    public Counter() {
    
    }
    // altenate constructor
    public Counter(int initial) {
        this.count = initial;
    }
    
    // an accessor method
    public int getCount() {
        return count;
    }
    // an update method
    public void increment() {
        count++;
    }
    // an update method
    public void increment(int delta) {
        count += delta;
    }
    // an update method
    public void reset() {
        count = 0;
    }
}
