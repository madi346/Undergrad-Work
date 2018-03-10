/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7exercises;

/**
 *
 * @author Madison
 */
public class student extends person {
    // variables 
   protected String major; 
  protected int unitsCompleted; 
  
  // constructor 
    public student() {
        super(); 
        // instantiate variable 
        major = ""; 
        unitsCompleted = 0; 
    }
  
    // getters and setters

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getUnitsCompleted() {
        return unitsCompleted;
    }

    public void setUnitsCompleted(int unitsCompleted) {
        this.unitsCompleted = unitsCompleted;
    }
    // getInfo() Method override 
    public String getInfo() {
        return " Name: " + name + " Address: " + address + " Age: " + Integer.toString(age) + 
                " Major: " + major + " Units: " + Integer.toString(unitsCompleted); 
    }
    
}
