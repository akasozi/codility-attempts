/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datastructures;

/**
 *
 * @author abubizibu
 */
public class RunLengthEncodingTest {
    
     public static void main(String[] args) {
        // Instantiate a new instance of the runlength encoding class
        RunLengthEncoding obj = new RunLengthEncoding();
        String input = "aaabbccc"; // 4a2b3c
        String output = ""; 
        // I want to know how long it takes, start timer
        long startTime = System.currentTimeMillis();
        long endTime; 
        
        output = obj.encode(input);
        endTime = System.currentTimeMillis();
        
        System.out.println("String to Encode: " + input + " output: " + output + " Encoding Algorithm took: " + (endTime - startTime) + "ms");   
        
        input = "4a5b2c";
        startTime = System.currentTimeMillis();
        output = obj.decode(input);
        endTime = System.currentTimeMillis();
        
        System.out.println("String to Decode: " + input + " output: " + output + " Decoding Algorithm took: " + (endTime - startTime) + "ms");
        
    }
    
}
