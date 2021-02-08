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

public class CountVowels {
    
    public static void main(String[] args) {
        // Hello
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String to count vowels: ");
        String input = scanner.nextLine();
        int numOfVowels = countNumberOfVowels(input);
        System.out.println("The number of vowels in String '" + input + "' is " + numOfVowels);
        
    }
    
    public static int countNumberOfVowels(String input) {

        String lowercaseInput = input.toLowerCase();
        int count = 0;
        
        for (int i = 0; i < lowercaseInput.length(); i++) {
        
            switch(lowercaseInput.charAt(i)) {
            
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
                    
                default:
                    break;
            }
        
        }
        return count;
    }
}
