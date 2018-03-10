/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SWC-Student
 */
public class NameTest {
    public static void main(String[] args) {
        // Create a person object 
        Person p = new Person("Pilar", "Smith", "T.S."); 
        System.out.println("Name = " + 
        p.getFirstName() + " " + p.getLastName() + " " + p.getMiddleInitial());  
        p.setFirstName("Linda"); // changes the first name to linda 
        System.out.println("Name = " + 
        p.getFirstName() + " " + p.getLastName() + " " + p.getMiddleInitial()); 
    }
}
