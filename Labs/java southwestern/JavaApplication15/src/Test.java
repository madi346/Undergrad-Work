/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SWC-Student
 */
public class Test {
    public static void main(String[] args) {
        // create a circle object
        Circle c = new Circle(87); 
        // circle object to 311.1 
        //this one makes the circle be 87.0
         System.out.println("Circle object is " 
                + c.getRadius()); 
         // this one makes the circle be 311.1
        c.setRadius(311.1); 
        System.out.println("Circle object is " 
                + c.getRadius()); 
    }
    
}
