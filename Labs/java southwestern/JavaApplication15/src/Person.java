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
     // instance variables these are private and strings 
     private String firstName; 
     private String middleInitial; 
     private String lastName; 
     // methods 
     public String getFirstName(){
        return firstName; 
     } 
     public String getMiddleInitial() {
         return middleInitial; 
     }
     public String getLastName(){
        return lastName; 
     }
     public void setFirstName(String nFirstName){
         firstName = nFirstName; 
     }
     public void setMiddleName(String nMiddleInitial) {
         middleInitial = nMiddleInitial; 
     }
     public void setLastName(String nLastName){
         lastName = nLastName; 
     } 
     // constructor 
     // dont put before the instance variables because they declare it that way 
     // you have to write it twice idk why tho 
    public Person(String iFirstName, String iLastName, String iMiddleInitial) {
        firstName = iFirstName;
        lastName = iLastName; 
        middleInitial = iMiddleInitial; 
    }
    public Person(String iFirstName, String iLastName) {
        firstName = iFirstName;
        lastName = iLastName;
    } 
      
}
