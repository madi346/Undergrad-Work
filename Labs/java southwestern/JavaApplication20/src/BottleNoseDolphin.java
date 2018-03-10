/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SWC-Student
 */
public class BottleNoseDolphin extends Dolphin {
    private String appearance; 
    public BottleNoseDolphin(float weight, String skin, boolean isEndangered, 
             byte age, boolean isCarn, String nameOfOcean, String appearance) {
        super(weight, skin, isEndangered, age, isCarn, nameOfOcean);  
        //well thats stupid that you have to write them out in the constrctor all over again
        this.appearance = appearance; 
    } 
    public String getAppearance() {
        return appearance; 
    }
    public void setAppearance(String appearance) {
        this.appearance = appearance; 
    }
    public String toString() {
        // so you do instance variables then constructors with super then this
        // then getters and seters 
        // then the return statement thingy with the 
        // public String toString() { return super.toString() + "" + ; 
        return super.toString() + " appearance of the majestic dolphin is " + appearance; 
    } 
}
