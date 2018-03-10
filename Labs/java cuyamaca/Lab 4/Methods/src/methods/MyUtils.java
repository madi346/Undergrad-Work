/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

// import statements go here if we need any
import java.text.DecimalFormat;



/**
 *
 * @author madison.hubbard
 */
public class MyUtils {
    
// Java method header
// Accesibility (public/private) static (because static method) (if class method)
//  return type (int, String, void if no return value)
//  method name or identifier and then the parameters (data type paramName)
// or () if no parameters 
    
    // code taken and adapted from the decimal formatting handout on BlackBoard
    public static String formatNum(float value, String fmt) {
    // declare local varaiable 
        String result = ""; 
        
        DecimalFormat df = new DecimalFormat(fmt); 
        
        
        // call or invoke the format method to get back a formatted number 
        result = df.format(value); 
        return result; 
    } 
    
    
    
    // lab step #12 
    public static boolean isInteger(String s) {
        boolean result = false; 
        
        // sneak peak of chapter 10 try/catch block
        try {
         // try to convert the string to an integer
            int val = Integer.parseInt(s); 
            return true; // if we get here we know its an int. 
        }
        catch(Exception ex) {
            // something went wrong here, its not an integer
  
            return false;
        }
    
    } // end of isInteger()
    
    public static int tryParseInt(String s, int defaultVal) {
        try {
            return Integer.parseInt(s); 
        }
        catch(Exception ex) {
            return defaultVal; 
        } // end of tryparseInt() // parameters 
        
          
        
        
        
        
        
        
    }
    // first param is the array to search 2nd param value to find 
        public static int findItem(int values[], int value) {
            int idx = -1; 
            int i = 0; 
            
            // loop to search the arrY 
            while(i < values.length && idx == -1) {
                // test to see if we have  a match 
                if (value == values [i]) {
                    idx = i; 
                }
                // make sure we incriment the loop coutner!
                i++; 
                
            } // end while 
                return idx;  
        }    
    
        // number 18 in lab 4, do an overloaded method 
    // first param is the array to search 2nd param value to find 
        public static int findItem(String values[], String value) {
            int idx = -1; 
            int i = 0; 
            
            // loop to search the arrY 
            while(i < values.length && idx == -1) {
                // test to see if we have  a match 
                // in Java, the == operator doesnt work on strings!!!
                // choices for doing string comparisons are .equals(), .eqyualsIgnoreCase()  and then the uper and lower ones 
             // if (value.toUpperCase().equals(values[i].toUpperCase() ))
                if (value.equalsIgnoreCase( values [i] )) {
                    idx = i;                 }
                // make sure we incriment the loop coutner!
                i++; 
                
            } // end while 
                return idx;  
        }     
    
    
    
        
        
        
        
        
        
        
        
        
} // end MyUtils class 
