/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SWC-Student
 */
public class catchtry {
    public static void main(String[] args) {
       
        try {
            Circle c1 = new Circle(3); 
            System.out.println(c1); 
        }
        catch(IllegalArgumentException a) {
            System.out.println("radius isnt positive");
        }
    }
    
}
