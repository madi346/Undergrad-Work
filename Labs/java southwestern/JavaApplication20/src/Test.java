/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SWC-Student
 */
public class Test{
    // THIS CLASS IS AN EXAMPLE OF OVERLOADING, 
    // THE OVERRIDING IS IN THE DOLPHINS AND BOOKS CLASSES :) 
    public static void main() {
        System.out.println("main one "); 
    }
    public static void main(String[] args) {
        System.out.println("main two "); 
        // first 
        main(); // something to do w/main one up there :) 
        // second because this is the ACTUAL MAIN CLASS IDK 
    }
}
