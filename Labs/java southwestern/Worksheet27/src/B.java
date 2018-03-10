/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SWC-Student
 */
public class B extends C {
   
    private int x; 
    private int y; 
    public B(int x, int y) {
        super(x); // the C class because youre extending it 
        this.y = y; 
    }
    public void displayName() {
        System.out.println("Class B"); 
    }
}
