/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1helloworld;

// import java.util.Scanner. This allows us to read input from the console
import java.util.Scanner; 

/**
 *
 * @author Madison
 */
public class Lab1HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Our code always goes between the opening and closing braces
        // First, declare 2 string variables and initialize to a blank string value
        String name = "";
        String message = ""; 
        
        // Create a Scanner object that will let us read what the user types in
        Scanner sc = new Scanner(System.in);
        
        // prompt the user for their name
        System.out.print("What is your name?");
        name = sc.next(); // read the user input
        
        // Format the message. Note how we use the + operator in Java to do what is
        // called string concatenation 
        message = "Hello" + name + ", welcome to Java programming!";
        
        // Now let's display the message 
        System.out.println(message);
    } // end main
        
    
    
    
}
