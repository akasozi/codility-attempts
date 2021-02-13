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
public class Pair<A,B> {
    
    private A first;
    private B second;
    
    public Pair(A a, B b) {
      first = a;
      second = b;
    }
    
    public A getFirst() {
       return first;
    }
    
    public B getSecond() {
       return second;
    }
    
    public static void main(String[] args) {
    
        Pair<String, Double> bid = new Pair<>("ORCL", 32.07); // Rely on type inference
        String stock = bid.getFirst();
        double price = bid.getSecond();
        
        Pair<String, Integer> person = new Pair<String, Integer>("MICROSOFT", 10); // give explicit types
        String name = person.getFirst();
        int age = person.getSecond();
    }
}
