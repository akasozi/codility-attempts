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
public class CounterTest {
    
    public static void main(String[] args) {
    
        Counter c; // declares a variable; no counter yet constructed
        c = new Counter(); // Constructs a counter; assigns its reference to c
        c.increment(); // increases the value of count by one
        c.increment(3); // increases the value of count by three more
        int temp = c.getCount(); // will be 4
        System.out.println("temp: " + temp);
        c.reset(); // value becomes zero
        
        Counter d = new Counter(5); // Declares and constructs a counter having value 5
        d.increment(); // value becomes 6
        Counter e = d; // Assign e to reference the same object as d;
        temp = e.getCount(); // Will be 6 (e and d reference the same object)
        System.out.println("d: " + d.getCount() + ", e: " + e.getCount()); 
        
        e.increment(2); // value of e (also known as d) becomes 8
        System.out.println("d: " + d.getCount() + ", e: " + e.getCount());
    
        int extremeTemp = temp;
        
        System.out.println("Temp: " + temp + ", ExtremeTemp: " + extremeTemp);
        
        extremeTemp++;
        System.out.println("Temp: " + temp + ", ExtremeTemp: " + extremeTemp);
        
    }
}
