/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SWC-Student
 */
public class Person {
    // how to create a class 
    // these are the private and/or public variables 
    private String nickName; 
    private String lastName; 
    private String firstName; 
    private int age; 
    // constructors 
    public Person (String nickName, String lastName, String firstName, int age) {
        // those string and int in () are parameters
        // these this are constructors 
        this.nickName = nickName; 
        this.lastName = lastName; 
        this.firstName = firstName; 
        this.age = age; 
         
    }

    public Person (String lastName, String firstName, int age) {
        this.lastName = lastName; 
        this.firstName = firstName; 
        this.age = age; 
        // or you  can do it this way 
      // this(null, lastName, firstName, age); 
    }
   // mutators or setters 
    public void setNickName(String nickName) {
        this.nickName = nickName; 
    }
    public void setLastName(String lastName) {
        this.lastName = lastName; 
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName; 
    }
    public void setAge(int age) {
        this.age = age; 
    }
    // accessors or getters 
    public String getNickName() {
        return nickName;  
    }
    public String getLastName() {
        return lastName; 
    }
    public String getFirstName() {
        return firstName; 
    }
    public int getAge() {
        return age; 
    }
    
    
    public static void main(String[] args) {
        
    }

}
