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
       
        // for loop
        int sum = 0; 
        for (int i = 1; i < 5; i++) {
            sum += i; 
            
        
        System.out.println("sum = " + sum); }
        
        // while loop 
        
       // int sum = 0; 
         int index = 1; 
         while (index < 5) {
             sum += index; 
             index++; // increment step
             
         }
         
         
        // char ch = 0; // character ch 
        //String str = "";  
       // int count1 = 0; 
       // int count2 = 0; 
       //  for (int kk = 0; kk < str.length(); kk++) {
          //   ch = str.charAt(kk); 
            
                 // if ('0' <= ch && ch <= '9') {
                      
              //   count1++; }
              
         //if ('A' <= ch && ch <= 'z') {
           //  count2++; 
         //}
         //System.out.println("count1 width in digits " + count1);
         //System.out.println("count2 width in digits " + count2); 
         //}
         
         
         String str = "abcde"; 
         for (int kk = 0; kk < str.length(); kk++) {
           System.out.println(str.charAt(kk)); 
         
         } 
    
         int kk = 0; 
         for (kk = 0; kk <= 8; kk++); 
         System.out.println("kk = " + kk);
        
        
for (int i = 0, j = 2; (i + j < 11); i++, j = j+2){
	System.out.println("i = " + i + " j = " + j);

         
    }

//int sum = 0; 
//for (int k = 1; k <= 1000; sum = sum + k++); 
//System.out.println("sum = " + sum); 
// DONT USE THIS KIND OF A LOOP ON AN EXAM 
 //for (int k = 1; k <= 1000; sum += ++k); 
 //System.out.println("sum = " + sum);
 // avoid using this on exam, this one is bigger ++k k++


 // w o r k s h e e t   w o r k    ! ! ! ! 
 
 
        for (int i = 1; i <= 10; i++) {
        
            System.out.println("num = " + i); }
        
        for (int i = 20; i >= 1; i--) {
            System.out.println("num = " + i);  
        }
           for (int i = 1; i <= 100; i++) {
           k = Math.pow(i, i); 
               System.out.println("sum of all 1 and 100 is " + k);
           }
 
}
}   

