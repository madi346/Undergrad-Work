/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SWC-Student
 */
public class Animal {
    // stuff we tell animals apart by
    // instance variables 
    private float weight; 
    private String skin; 
    private boolean isEndangered; 
    private byte age; 
    private boolean isCarn; // carnivore 
    public Animal(float weight, String skin, 
            boolean isEndangered, byte age, boolean isCarn) {
        this.weight = weight; 
        this.skin = skin; 
        this.isEndangered = isEndangered; 
        this.age = age; 
        this.isCarn = isCarn; 
    }
    public float getWeight() {
        return weight;  
    }
    public String getSkin() {
        return skin; 
    }
    public boolean getIsEndangered() {
        return isEndangered; 
    }
    public byte getAge() {
        return age; 
    }
    public boolean getIsCarn() {
        return isCarn; 
    }
    public void setWeight(float weight) {
        this.weight = weight; 
    }
    public void setSkin(String skin) {
        this.skin = skin; 
    }
    public void setIsEndangered(boolean isEndangered) {
        this.isEndangered = isEndangered; 
    }
    public void setAge(byte age) {
        this.age = age; 
    }
    public void setIsCarn(boolean isCarn) {
        this.isCarn = isCarn; 
    }
    public String toString() {
        return "weight = " + weight + " skin = " + skin + " is the animal endangered " 
                + isEndangered + " age = " + age + " isCarn = " + isCarn; 
    }
}
