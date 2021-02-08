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

public class RemovePuctuationExercise {

   public static void main(String[] args) {
   
       String input = "Let's try, Mike!";
       String output = removePuctuation(input);
       System.out.println("Output: " + output);
   }
   
   public static String removePuctuation(String input) {
   
       StringBuilder sb = new StringBuilder(input);
       
       for (int i = 0; i < sb.length(); i++) {
       
           switch(sb.charAt(i)) {
           
               case '.':
               case '?':
               case '!':
               case ',':
               case ';':
               case ':':
               case '-':
               case '[':
               case ']':
               case '{':
               case '}':
               case '(':
               case ')':
               case '\'':
                  sb.deleteCharAt(i); // Delete the charater if it matches
                  break;
               default:
                   break;
           
           }
       
       }
       return sb.toString();
   }
}
