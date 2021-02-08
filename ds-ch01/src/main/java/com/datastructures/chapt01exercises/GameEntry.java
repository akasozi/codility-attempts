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
public class GameEntry {
    
    public int score;
    
    public GameEntry(int score) {
     this.score = score;
    }

    @Override
    public String toString() {
        return "GameEntry{" + "score=" + score + '}';
    }
    
    
}
