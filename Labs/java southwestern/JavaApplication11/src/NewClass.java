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
        
        System.out.println(cylinderVolume(1,1)); 
         
        System.out.println(test(5)); 
        
        
        int a = 9; 
        int c = mOne(a); 
        System.out.println("a is " + a); 
        System.out.println("c is " + c); 
        
        double maxX1 = max(7,3); 
        double maxY1 = max (9,100); 
        System.out.println("the max x is " + maxX1); 
        System.out.println("the max y is " + maxY1); 
        
        
        double maxX2 = maxTwo(3,2,1); 
        double maxY2 = maxTwo(4,6,5); 
        double maxZ2 = maxTwo(8,9,10); 
        System.out.println("the max x is " + maxX2);
        System.out.println("the max y is " + maxY2);
        System.out.println("the max z is " + maxZ2); 
        
        
        
    }
    public static double cylinderVolume(double r, double h) {
        return Math.PI*r*r*h; 
    }
    public static int test(int b) {
        b = 20; // change the value of parameter b 
        return 2*b; 
    }
    public static int mOne(int a) {
        a = 11; // parameter "a" is defined in mOne
        System.out.println("a = " + a); 
        return a - 4; 
    }
    public static int cubeVolume(int len){
        int volume; 
		if (len >= 0){
			volume = len*len*len;  
		}
                else {
                    volume = 0; 
                }
                return volume; 
	}

    
    ////////////////////////////////////////////////////////////////////
    
    
    public static double max(double x, double y) {
        // max and maxTwo method 
       double maxX1 = x; 
       double maxY1 = y; 
       if (x > y) {
         return x;   
       }
       else {
           return y; 
       }   
    }  
    
    
    public static double maxTwo(double x, double y, double z) {
        double maxX2 = x; 
        double maxY2 = y; 
        double maxZ2 = z; 
         //return (x > y && x > z)?(y > z && y > x):(z > y && z > x);  
        if (x > y && x > z)  {
            return x; 
        } 
        else if ( y > x && y > z) {
            return y;
        }
        else{
            return z; 
        }
    }
}
