/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Madison Hubbard
 */
import java.util.Scanner;
public class ReadData {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a, b;
        System.out.println("Enter an int for a:");  
        a = in.nextInt(); //in is a Scanner var.
        System.out.println("Enter an int for b:"); 
        b = in.nextInt();
        System.out.print("The sum is: "); 
        System.out.println(a + b);
        final double INCHES_PER_FOOT = 12; 
        int feet = 24; 
        System.out.print("Length in inches:"); 
        System.out.println("feet * INCHES_PER_FOOT");
        
        
        double num; 
       num = Math.sqrt(1.0 + Math.PI); 
        
       double x = 3; 
       num = Math.pow(x,4); 
       System.out.print(num); 
      
       
       num = 3 * x; 
       
  
      num = ( 3x + y ) / ( z + 2 ); 
       num = 1 + 4.5; 
    //    var z = 4; 
       
      num  = 11z + 9; 
       
       num = (a + b) / 2c; 
                
        
        
    }

}
