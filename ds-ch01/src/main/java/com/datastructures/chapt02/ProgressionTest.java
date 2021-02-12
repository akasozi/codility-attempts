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
public class ProgressionTest {
    
    public static void main(String[] args) {
        // Progression progression = new Progression(2);
        // progression.printProgression(5);
        
        ArithmeticProgression arithmeticProgression = new ArithmeticProgression(128);
        arithmeticProgression.printProgression(1000000000);
        
        // Progression progression = new ArithmeticProgression(4, 2);
        // progression.printProgression(10);
        // ((Progression) progression).printProgression(10);
        
        //GeometricProgression geometricProgression = new GeometricProgression(3);
        //geometricProgression.printProgression(1000);
        // FibonacciProgression fibonacciProgression = new FibonacciProgression(2, 2);
        // fibonacciProgression.printProgression(8);
        
        // Progression fibonacciProgression = new FibonacciProgression();
        // ((Progression) fibonacciProgression).printProgression(10);
        
    }
}
