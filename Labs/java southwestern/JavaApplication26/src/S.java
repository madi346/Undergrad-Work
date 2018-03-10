/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SWC-Student
 */
public class S implements Describable { 
    
    private int x; 
    public S() {
        x = 0; 
    }
    public String describeClass() {
        return "this is class S"; 
    }
    public int getX() {
        return x; 
    }
}
