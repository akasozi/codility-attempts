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
public class RunLengthEncoding {
        
    
    public String encode(String stringToEncode) {
        // aabbcc
       // Check for null input
       if (stringToEncode == null || stringToEncode.length() == 0) {
          return "";
       }
       System.out.println("Received Input: " + stringToEncode);
       char[] charArray = stringToEncode.toCharArray();
       char prevChar = charArray[0];
       int counter = 0;
       StringBuilder sb = new StringBuilder();
       // Iterate over the input
       for (char currentChar : charArray) {
         if (currentChar == prevChar) { 
            counter++;
         } else { 
             if (prevChar != 0) {
                sb.append(counter).append(prevChar);
             }
             prevChar = currentChar;
             counter = 1;
         }   
       }
       sb.append(counter).append(prevChar);
       return sb.toString();
    }
    
    
      /**
     * 10a1b1c -> abc
     * 2a3b3c -> aabbbccc
     *  
     */
    public String decode(String input) {
        // check for null input
        if (input == null || input.length() == 0) {
           return "";
        }
        
        char[] charArr = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        char prevChar = 0; //charArr[0];
        boolean isGreaterThan10 = false;
        int tempLimit = 0;
        // Iterate through the array
        for (char curChar : charArr) {
             if (prevChar != curChar && Character.isDigit(prevChar) && Character.isAlphabetic(curChar)) {
                 if (isGreaterThan10 && tempLimit != 0) {
                    while (counter < tempLimit) {
                     sb.append(curChar);
                     counter++;
                    }
                    isGreaterThan10 = false;
                    tempLimit = 0;
                 } else {
                    int limit = Character.getNumericValue(prevChar);
                    while (counter < limit) {
                        sb.append(curChar);
                        counter++;
                    }                 
                 }
                 counter = 0; // reset the counter
                 prevChar = curChar; // shift the value 
             
             } else if ((prevChar != curChar || prevChar == curChar) && Character.isDigit(prevChar) && Character.isDigit(curChar)){
                 // System.out.println("prevChar: *** " + prevChar + ": curChar: " + curChar);
                 isGreaterThan10 = true;
                 String tempStr = new StringBuilder().append(tempLimit).append(prevChar).append(curChar).toString();
                 // System.out.println("tempStr: " + tempStr);
                 tempLimit = Integer.parseInt(tempStr);
                 // System.out.println("tempLimit: " + tempLimit);
                 prevChar = curChar;
             } else {
                 prevChar = curChar;
             }
        }
        return sb.toString();
    }
}
