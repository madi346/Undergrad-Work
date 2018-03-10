/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SWC-Student
 */
public class B {
    public static void main(String[] args) {
        
    }
    int x; 
    int y; 
    int z;
    public B (int x, int y, int z){
        this.x = x; 
        this.y = y; 
        this.z = z; 
    }
    public B(int x, int y) {
        // the constructor/this has to be first 
        this(x, y, 0); 
        int z = 100; 
    }
}
