/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SWC-Student
 */
public class rose {
    public static String magic(String s) {
        String r = ""; 
        boolean got = false; 
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                r += s.charAt(i); 
                got = true; 
            } else if (got) {
                return r; 
            }
        }
        return r; 
    }      
    public static int methodOne(int x) {
        return x + ((x + 4)&3); 
    }
    public static int methodTwo(int z) {
        return methodOne(z) / 2; 
    }
    
    public static int methodX(int a, int b) {
        a = a << 1; 
        b = (b>0)?3*b:-3*b; 
        System.out.println("a = " + a + " b = " + b);
        return a + b; 
    } 
    
    public static int one(int m) {
        return (m << 1) + (m >> 1); 
    }
    public static int two(int m) {
        return (one(m) + m)/3; 
    }
    public static int three(int m) {
        return two(m>>2); 
    }
    
    
    
    
    public static void main(String[] args) {
       System.out.println(magic("HBgd72&2*99")); 
       
       int x1 = methodOne(3); 
       int x2 = methodTwo(methodOne(2)); 
       System.out.println(" x1 is " + x1); 
       System.out.println(" x2 is " + x2); 
       
       
       int a = 2; 
       int b = -2; 
       int x = methodX(a,b); 
       System.out.println(" x = " + x + " a = " + a + " b = " + b);
       
       int m1 = one(3); 
       int m2 = two(4); 
       int m3 = three(one(2)); 
       System.out.println("m1 = " + m1);
       System.out.println("m2 = " + m2);
       System.out.println("m3 = " + m3); 
    System.out.println(14/3); 
    }
} 
