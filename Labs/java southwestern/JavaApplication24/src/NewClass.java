/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SWC-Student
 */
public class NewClass {
    public static void main(String[] args) {
        try {
            int[] x = new int[4]; 
            x[4] = 0; // runtime error 
            System.out.println("no error"); 
        }
        catch (IndexOutOfBoundsException a) {
            System.out.print("index out of bounds at index = "); 
            System.out.println(a.getMessage()); 
        }
            System.out.println("After try-catch"); 
            try {
                int[] x = new int[4]; 
                x[2] = 0; 
                System.out.println("no error"); 
            }
            catch (IndexOutOfBoundsException a) {
                System.out.print("index out of bounds at index = ");
                System.out.println(a.getMessage());
            }
            System.out.println("After try-catch"); 
            //try {
                //int[] x = new int[4]; 
                //x[4] = 0; // untrapped error - program execution ends 
                //System.out.println("no error");
           // }
            // only catches null pointer exceptions 
           // catch (NullPointerException a ) {
               // System.out.print("doesnt refer to an object"); 
            //}
            // this program above would crash 
            try { 
                int[] x = new int[4]; 
                x[4] = 0; 
                System.out.println("no error"); 
            }
            catch (Exception a) {
                System.out.println("An exception occured in your code");
            }
          try {
              int y = Integer.parseInt("abc"); // cant convert string "abc" to int 
              int[] x = new int[4]; 
              x[4] = 0; // array index out of bounds error
              System.out.println("no error"); 
          }  
          catch (NumberFormatException a) {
              System.out.println("bad input argument to parseInt"); 
          }
          catch (Exception a) {
              System.out.println("An exception occured in your code");
          }
          try {
              int[] x = new int[4]; 
              x[4] = 0; // 1st runtime error 
              int y = Integer.parseInt("abc"); 
              System.out.println("no error"); 
          }
          catch (NumberFormatException a) {
              System.out.println("bad input argument to parseInt");
          }
          catch (Exception a) {
              System.out.println("an exception occured in your code ");
          }
          
    }
}
