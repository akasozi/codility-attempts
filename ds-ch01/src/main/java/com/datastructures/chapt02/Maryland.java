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
public class Maryland  extends State {
   
    /**
     * Object -> Place -> Region -> State -> Maryland
     * 1. "Read it."
     * 2. "Ship it."
     * 3. "Buy it"
     * 4. "Read it"
     * 5. "Box it"
     * 6. "Box it"
     */
    Maryland() { }
    
    public void printMe() {
       System.out.println("Read it.");
    }
    
    public static void main(String[] args) {
         Region east = new State(); // Ship it. 
         State md = new Maryland(); // Read it. 
         Object obj = new Place();  // Buy it.
         Place usa = new Region();  // Box it.
         md.printMe(); // "Read it." 
         east.printMe(); // "Shit it."
         ((Place) obj).printMe(); // "Buy it."
         obj = md;
         ((Maryland) obj).printMe(); // "Read it."
         obj = usa;
         ((Place) obj).printMe(); // "Box it."
         usa = md;
         ((Place) usa).printMe(); // "Read it."
    }
    
}



class State extends Region {
    State() {
        
    }
    
    public void printMe() {
       System.out.println("Ship it.");
    }
   
}

class Region extends Place {
   Region() { }
   public void printMe() {
      System.out.println("Box it.");
   }
}

class Place extends Object {
  Place() { }
  public void printMe() {
     System.out.println("Buy it.");
  }
}
