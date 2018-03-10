/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SWC-Student
 */
public class Dolphin extends Animal { 
    private String nameOfOcean; 
    public Dolphin(float weight, String skin, 
            boolean isEndangered, byte age, boolean isCarn, 
            String nameOfOcean) {
        super(weight, skin, isEndangered, age, isCarn);  
        this.nameOfOcean = nameOfOcean;  
    }
    public String getNameOfOcean() {
        return nameOfOcean; 
    }
    public void setNameOfOcean(String nameOfOcean) {
        this.nameOfOcean = nameOfOcean; 
    }
    public String toString() {
        // use return super.toString() whenever you extends a class 
        return super.toString() + "name of the ocean = " + nameOfOcean; 
    }
}
