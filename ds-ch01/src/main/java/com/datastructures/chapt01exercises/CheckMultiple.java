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
import java.util.Scanner;

public class CheckMultiple {

        
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Simple program to find whether N is a Multiple of M:");
        System.out.print("Enter N:");
        long n = scanner.nextLong();
        System.out.print("Enter M:");
        long m = scanner.nextLong();
        System.out.println("N = " + n + " M = " + m + " isMultiple() => " + isMultiple(n, m));
        
    }
    
    public static boolean isMultiple(long n, long m) {

        if (m > n)
            return false;
        
        if (n % m == 0) 
           return true;  
        else 
            return false;
    }
}
