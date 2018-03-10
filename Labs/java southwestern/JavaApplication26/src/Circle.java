/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SWC-Student
 */
public class Circle implements Comparable<Circle>{ 
    //public static void main(String[] args) {
    } 
    private int radius; 
    public int compareTo(Circle c) {
        int n = radius - c.radius; 
        return n; 
    }
    
}
