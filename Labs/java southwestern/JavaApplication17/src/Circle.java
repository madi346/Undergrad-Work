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
        Circle cOne = new Circle(20, 11, 1); // constructor 1
        System.out.println("Radius = " + cOne.getradius()); 
        System.out.println("Center = (" + cOne.getxCenter() + "," 
            + cOne.getyCenter() + ")"); 
        Circle cTwo = new Circle(2); // constructor 2 
        System.out.println("Radius = " + cTwo.getradius()); 
        System.out.println("Center = (" + cTwo.getxCenter() + "," 
            + cTwo.getyCenter() + ")"); 
    }
    private int radius; 
    private int xCenter; 
    private int yCenter; 
    public Circle(int radius, int xCenter, int yCenter) {
        this.radius = radius; 
        this.xCenter = xCenter; 
        this.yCenter = yCenter; 
    }
    public Circle(int radius) { // constructor 2 
      //  this.radius = radius; 
        // if you dont put the xCenter and yCenter to 0 then it goes there by default
       // xCenter = 0; 
      //  yCenter = 0;  
        this(radius, 0, 0); 
         System.out.println("circle");  
         // now the print thing is after the constructor there is no more error 
    }
    public int getradius() {
        return radius; 
    }
    public int getxCenter() {
        return xCenter; 
    }
    public int getyCenter() {
        return yCenter; 
    }
    public void setRadius(int radius) {
        this.radius = radius; 
    } 
   
 
    }
    
    

