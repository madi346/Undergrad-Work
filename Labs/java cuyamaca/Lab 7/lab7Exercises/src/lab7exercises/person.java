/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7exercises;

/**
 *
 * @author Madison Hubbard
 */
public abstract class person {
    protected String name; 
    protected String address; 
    protected int age; 
    
    public person() {
        name = ""; 
        address = ""; 
        age = 0; 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    // abstract method for header
    public abstract String getInfo(); 
}  // end class person 

