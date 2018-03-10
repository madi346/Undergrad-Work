/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SWC-Student
 */
import java.util.Scanner; 
public class testing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        
        for(int kk = 1; kk <= 12; kk++) {
            System.out.println("kk = " + kk); 
        }
        for(int kk = 3; kk <= 9; kk++) {
            System.out.println("kk = " + kk);
        }
        for(int kk = 10; kk > -2; kk--) {
            System.out.println("kk = " + kk);
        }
        for(int kk = 10; kk <= 220; kk = kk + 10) {
            System.out.println("kk = " + kk);
        }
        for(int kk = 30; kk < 220; kk = kk + 10) {
            System.out.println("kk = " + kk);
        }
        for(int kk = 18; kk <= 72; kk = kk + 9) {
            System.out.println("kk = " + kk); 
        }
            int num = 10; 
            double average, input;  
            double total = 0.0; 
            for(int kk = 1; kk <= num; kk++) {
                System.out.println("Enter a number = ");
              input = in.nextDouble(); 
                total = total + input; 
            }
            average = total / num; 
            System.out.println("average is = " + average);
            
            // this one iterates it 6 times because 3 * 2 is 6 
            for(int j = 1; j <= 2; j++)
            for(int k = 1; k <= 3; k++)
                System.out.println(j + "^2 + " + k + "^2 = " + (j*j + k*k));
            
            System.out.println("hello"); 
            
            // or 
            // this one iterations 5 times bc 3 + 2 is 5
            for(int j = 1; j <= 2; j++)
                for(int k = j; k <= 3; k++) 
                    System.out.println(j + "^2 + " + k + "^2 = " + (j*j + k*k));
            
            
            
            // // // // // // // // // // // // // // // this is the homework for pp 12 and 13 
            for(int pp = 1; pp <= 1; pp++) 
                System.out.println(pp); 
            
            for(int pp = 1; pp < 3; pp++) 
                System.out.print(pp + " "); 
            System.out.println(); 
            for(int pp = 1; pp < 4; pp++)
                System.out.print(pp + " "); 
            System.out.println(); 
            for(int pp = 1; pp < 5; pp++)
                System.out.print(pp + " "); 
            System.out.println(); 
            for(int pp = 1; pp < 6; pp++)
                System.out.print(pp + " ");
            System.out.println(); 
            for(int pp = 1; pp < 7; pp++)
                System.out.print(pp + " ");
            System.out.println(); 
            for(int pp = 1; pp < 7; pp++)
                System.out.print(pp + " ");
            System.out.println(); 
            for(int pp = 1; pp < 6; pp++)
                System.out.print(pp + " ");
            System.out.println(); 
            for(int pp = 1; pp < 5; pp++)
                System.out.print(pp + " "); 
            System.out.println();  
            for(int pp = 1; pp < 4; pp++)
                System.out.print(pp + " "); 
            System.out.println(); 
            for(int pp = 1; pp < 3; pp++) 
                System.out.print(pp + " "); 
            System.out.println(); 
            for(int pp = 1; pp <= 1; pp++) 
                System.out.println(pp); 
            // or you can write it as something else 
            
            int k; 
            for(k = 1; k < 27; k = k + 5) {
                System.out.println("k = " + k); 
            }
                System.out.println("Last value of k = " + k);
                
                
                for(double x = 1.0; x <= 100.0; x = x + 1.0)
                    for(double y = 100.0; y >= 1.0; y = y - 1.0)
                        System.out.println(y/x);
    }  
}
