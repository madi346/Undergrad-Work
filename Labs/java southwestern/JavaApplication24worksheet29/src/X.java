/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SWC-Student
 */
public class X {
    // agent x hahahhaa 
    // number 1 on worksheet 
    public static void main(String[] args) {
        try {
            String t = null; 
            int x = t.length(); 
            int a = Integer.parseInt("12+2"); 
        }
        catch (NumberFormatException n) {
            System.out.println("format error"); 
        }
        catch (Exception e) {
            System.out.println("general error");
        }
        System.out.println("finished"); 
        
        // number 2 on worksheet
        try {
            int a = Integer.parseInt("123"); 
            double[] z = new double[1000]; 
            z[100] = 0.0; 
        }
        catch (NumberFormatException n) {
            System.out.println("format error");
        }
        catch (Exception e) {
            System.out.println("general error");
        }
        System.out.println("finished"); 
        
        // number 3 on worksheet 
       
        try {
            double[] z = new double[1000]; 
            z[1008] = 0.0; 
            int a = Integer.parseInt("cat"); 
        }
        catch (NumberFormatException n) {
            System.out.println("format error");
        }
        catch (Exception e) {
            System.out.println("general error"); 
        }
        System.out.println("finished");
        
        // number 4 on worksheet
        
        try {
            int a = Integer.parseInt("abc"); 
            double[] z = new double[1000]; 
            z[1008] = 0.0; 
        }
        catch (NumberFormatException n) {
            System.out.println("format error");
        }
        catch (Exception e) {
            System.out.println("General error");
        }
        System.out.println("finished");
        
        // number 5 on worksheet 
        
        try {
            String s = null; 
            System.out.println(s.length()); 
        }
        catch (NullPointerException e) {
            System.out.println("Null Pointer Exception");
        }
        catch (Exception e) {
            System.out.println("Runtime Error");
        }
        System.out.println("Finished");
        // IM FINALLY FINISHED GOOD JOB MADI FOR DOING
        // ALL OF THE WORKSHEET 
    }
}
