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
public class GameEntryExercise {
 
    public static void main(String[] args) {
    
        GameEntry[] A =  { new GameEntry(5), new GameEntry(15), new GameEntry(25), new GameEntry(60), new GameEntry(97), new GameEntry(88) };
        GameEntry[] B = A.clone();
        for (int index = 0; index < A.length; index++) {
           System.out.println("[" + index + "] => " + A[index].toString());
        }
        
        A[4].score = 550;
        
        System.out.println("xxxxxxxxxxxxxxxx");
        for (int index = 0; index < B.length; index++) {
           System.out.println("[" + index + "] => " + B[index].toString());
        }
        
       
        // System.out.println("B[4] = " + B[4].score);
    }
}
