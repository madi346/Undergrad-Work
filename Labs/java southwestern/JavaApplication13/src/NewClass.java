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
        int[] exams = new int[5]; 
      //  int[] exams = {90, 65, 77, 60, 98}; 
        int[] computer = new int[5439]; 
        System.out.println("Number of elements in list");
        System.out.println(" is " + computer.length); 
        // string length() vs length 
        String str = "house"; 
        char[] word = new char[45]; 
        System.out.println("Length of String is " + str.length()); 
        System.out.println("Length of the array is " + word.length); 
        
        // array name is numbers 
        final int NUM= 1000; 
        double[] numbers = new double[NUM]; // NUM is stored in memory 
        for (int k = 0; k < numbers.length; k++) 
            numbers[k] = 1.0; 
        
        int[] list = new int[10]; 
        list[0] = 90; 
        int[] num; 
        num = list; 
        //with just those four it makes it be 90 
        // down below this the num[0] = 1; it doesnt make it be equal both equal to 90
        num[0] = 1; 
        // it makes it be both equal to 1  not 90
        System.out.println(list[0]);
        System.out.println(num[0]); 
        
        System.out.println(27&3);
        
        int[] a = {1,9,22,45,100,32482,982,0,-13,-34}; 
        System.out.println("a[8]= " + a[8]); // a[8] = -13 
        System.out.println("Number of elements in a= " + a.length); 
        
        // error ones below 
       // int[]x = new int[900]; 
       // for (int k = 0; k <=x.length; k=k + 1) {
          //  x[k] = 1;   // needs a print thing   
        //} 
        double[]c = new double[10]; 
        for (int k = 0; k < c.length;k = k + 1) {
            c[k] = 0;  
        }
        
        int[] x = new int[5];  
        x[0] = 10; 
        
        // runtime error? 
        char[] chArr = new char[10]; 
        chArr[5] = 'd';   
        
        
        int total = 0; 
        for (int i = 0; i < a.length; i++) {
            total = total + a[i]; 
           
            
            //int k = new int(30); 
          //  double[] d new double[30];  
           // char[] r = new char(1..30); 
           // int[] p = (3,4,2,2);  
           // float[] f = {2.3; 4.5; 6.6}; 
         //   char[] c = new char(); 
            
            int[] arr = {1,2,-1,0,4,1}; 
            for (int p = 1; p < arr.length; p++) {
                arr[p] = arr[p -1]; 
            }
            
        }
    }
}
