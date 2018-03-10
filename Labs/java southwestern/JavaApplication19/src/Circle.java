/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SWC-Student
 */
public class Circle {
    public static void main(String[] args) {
    Circle cOne = null; 
    cOne = new Circle(2.0); 
    double r = cOne.getRadius(); 
    // runtime error below 
    String t = "hello world"; 
    t = null; // null is a keyword
    System.out.println(t.length()); 
    // array of objects 
    //Person[] personArray = new Person[7]; 
  //  personArray[0] = new Person(); 
    }
}
