/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SWC-Student
 */
public class NewClass {
  public static void displayObjectType(Vehicle v) {
      System.out.println(v.toString()); 
      // instantiates vehicle v i guess
  }
      public static void main(String[] args) {
          System.out.println(); // prints a blank line
          Vehicle v = new Vehicle(); // v is now a vehicle maybe
          displayObjectType(v); 
          v = new Car(); // v is now a car object
          displayObjectType(v); 
          v = new Bicycle(); // v is now a bicycle
          displayObjectType(v); 
          System.out.println(); // prints a blank line 
      }
      
      
}
