/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author Madison
 */
public class Person extends Object implements Comparable {
    // private field variables 
    private String lastName; 
    private String address; 
    
    // default constructor 

    public Person() {
        super(); 
        lastName = "";
        address = "";    
    }
    // custom constructor 

    public Person(String lastName, String address) {
        super(); // to call the inhereted constructor 
        this.lastName = lastName;
        this.address = address;
    }
    
        // getters and setters 

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    // compareTo() method required for the comparable interface 
    @Override 
    public int compareTo(Object person) throws ClassCastException {
        // first test and make sure that we have a Passenger object instance
        if (! (person instanceof Person)) {
            throw new ClassCastException("Person object expected"); 
        }
        
        // do a type cast to a sortedEmployee object
        String myName = ((Person) person).getLastName(); 
        
        // compare and return the result 
        return this.getLastName().compareToIgnoreCase(myName); 
        
    } 
    
    @Override 
    public String toString() {
        return lastName + " " + address; 
    } 
    
} // end Person class
