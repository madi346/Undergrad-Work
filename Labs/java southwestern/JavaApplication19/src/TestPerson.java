/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SWC-Student
 */
public class TestPerson {
    public static void main(String[] args) {
        Person[] personArray; // personArray has no assigned value 
        personArray = new Person[3]; // assign array of Person objects 
       
	//Assign a Person object to each element
	personArray[0] = new Person("hello", "Pilar", "Mel", 34); 
	personArray[1] = new Person("hello", "Max", "Frye", 11); 
	personArray[2] = new Person("hello", "Joan", "Zen", 51);  
	//display data 
	for (int k = 0; k < personArray.length; k++){
	System.out.println(personArray[k].toString());
	} 

        
    }
}
