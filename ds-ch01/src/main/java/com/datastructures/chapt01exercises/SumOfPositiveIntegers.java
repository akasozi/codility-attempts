/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datastructures.chapt01exercises;

/**
 *
 * @author abubizibu
 */
public class SumOfPositiveIntegers {
    
    public static void main(String[] args) {
    
        int n = 10;
        System.out.println("The sum of all positive numbers <= " + n + " is: " + sumOfPositive(10));
        System.out.println("The sum of all odd numbers <= " + n + " is: " + sumOfOddPositiveNumbers(10));
    }
    
    public static int sumOfPositive(int n) {
        
        
        // validate input
        if (n <=  0)
            return 0;
        
        // variable to hold the sum of all positive integers <= n
        int sum = 0;
        for (int i = 1; i < n; i++) {
            // an even number is one that is perfectly divisible by 2 
            sum += i;
        }
        return sum;
    }
    
    public static int sumOfOddPositiveNumbers(int n) {
        // validate for input
        if (n < 0)
            return 0;
        // variable to hold the sum of all positive integers <= n
        int sum = 0;
        for (int i = 1; i < n; i++) {
            // an even number is one that is perfectly divisible by 2 
            if (!(i % 2 == 0))
                sum = sum + i;
        }
        return sum;
    }
    
    public static int sumOfPositiveSquares(int n) {
    
        if (n < 0)
            return 0;
        
        int sum = 0;
 
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }
}
