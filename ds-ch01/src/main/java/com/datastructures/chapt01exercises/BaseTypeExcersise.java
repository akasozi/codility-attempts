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

public class BaseTypeExcersise {
    // Choice to hold each of the base types
    private static final int BOOLEAN = 1;
    private static final int BYTE = 2;
    private static final int CHAR = 3;
    private static final int SHORT = 4;
    private static final int INTEGER = 5;
    private static final int LONG_INTEGER = 6;
    private static final int FLOAT = 7;
    private static final int DOUBLE = 8;
    
    private static final String WELCOME_MESSAGE = 
            "This program allows you to input a new value for each of the base types and outputs what you have entered.\n"
            + "1. Boolean\n"
            + "2. Byte\n"
            + "3. Char\n"
            + "4. Short\n"
            + "5. Int\n"
            + "6. Long\n"
            + "7. Float\n"
            + "8. Double\n"
            + "Enter -1 to Exit: ";
    
    public static void main(String[] args) {
    
       inputAllBaseTypes();
    }
    
    public static void inputAllBaseTypes() {

        Scanner inputScanner = new Scanner(System.in);
        int choice = 0;
        
        while (choice != -1){
            
            System.out.print(WELCOME_MESSAGE);
            choice = inputScanner.nextInt();
            
            switch(choice) {
                case BOOLEAN:
                    System.out.print("Enter a boolean: ");
                    boolean booleanInput = inputScanner.nextBoolean();
                    System.out.println("You have entered: " + booleanInput);
                    break;
                    
                case BYTE:
                    System.out.print("Enter a Byte: ");
                    byte byteInput = inputScanner.nextByte();
                    System.out.println("You have entered: " + byteInput);
                    break;
                    
                case CHAR:
                    System.out.print("Enter a char: ");
                    char charInput = inputScanner.next().charAt(0);
                    System.out.println("You have entered: '" + charInput + "'");
                    break;
                    
                case SHORT:
                    System.out.print("Enter a Short integer value: ");
                    short shortInput = inputScanner.nextShort();
                    System.out.println("You have entered: " + shortInput);
                    break;
                    
                case INTEGER:
                    System.out.print("Enter an Integer value: ");
                    int intInput = inputScanner.nextInt();
                    System.out.println("You have entered: " + intInput);
                    break;
                    
                case LONG_INTEGER:
                    System.out.print("Enter a Long value: ");
                    long longInput = inputScanner.nextLong();
                    System.out.println("You have entered: " + longInput);
                    break;
                    
                case FLOAT:
                    System.out.print("Enter a Float value: ");
                    float floatInput = inputScanner.nextFloat();
                    System.out.println("You have entered: " + floatInput);
                    break;
                    
                case DOUBLE:
                    System.out.print("Enter a double value: ");
                    double doubleInput = inputScanner.nextDouble();
                    System.out.println("You have entered: " + doubleInput);
                    break;
                    
                default:
                    System.out.println("Invalid input " + choice + " specified!");
            
            }
            
        }
        
        System.out.println("Program terminating.");
       

    }
}
