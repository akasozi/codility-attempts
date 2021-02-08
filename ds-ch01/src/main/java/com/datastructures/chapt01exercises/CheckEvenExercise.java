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

public class CheckEvenExercise {

   public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a number to find out if it is even: ");
        int number = scanner.nextInt();
        boolean resp = isEven(number);
        
        if (resp) 
           System.out.println("The input '" + number + "' is Even");
        else 
            System.out.println("The input '" + number + "' is NOT an Even Number");
                
       
   }   
   
   public static boolean isEven(int i) {
   
       boolean resp = false;
       while ( i > 0) {
           i = i - 2;
           if (i == 0) {
              resp = true;
           }
       }
       return resp;
   }
 }
