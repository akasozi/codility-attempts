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
public class ReverseArray {

   public static void main(String[] args) {
      int[] A = { 11, 12, 13, 14, 15 };
      A = reverse(A);
      
      for (int element : A) 
          System.out.println(element);
   }
   /*
    * { 11, 12, 13, 14, 15 }
    * 
    * { 15, 14, 13, 12, 11 }
    * 
    */
   public static int[] reverse(int[] n) {
       int counter = 0;
       int[] Y = new int[n.length];
       
       for (int index = n.length - 1; index >= 0; index--) {
           Y[counter] = n[index];
           counter++;
       }
       return Y;
   }
}
