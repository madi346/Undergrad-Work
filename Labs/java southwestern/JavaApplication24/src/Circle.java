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
    
    private int radius; 
    public Circle(int radius) {
        if (radius <= 0.0) {
            throw new IllegalArgumentException(); 
        }
        this.radius = radius; 
    }
    public String toString() {
        return "radius = " + radius; 
    }
    public static void main(String[] args) {
        try {
            Circle c1 = new Circle(-1); 
            System.out.println(c1); 
        }
        catch(IllegalArgumentException a) {
            System.out.println("radius isnt positive");
        }
    }
}
