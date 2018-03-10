
import java.util.Scanner;

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
import java.io.File; 
import java.io.FileNotFoundException; 
import java.io.PrintWriter; 
public class school {
    public static void main(String[] args) {
     try {
          // open for reading 
          Scanner in = new Scanner(new File("c:\\data.txt"));  
          String str = in.nextLine(); // read a string from data.txt
          System.out.println(str); // send output to console
          in.close(); // close the file for writing 
      }
      catch (FileNotFoundException f) {  
          System.out.println("cant open file"); 
      } // so do all of this and then no .txt in it...file thing 
   
    //the hasNext thing 
   //  try {
      //   Scanner in = new Scanner(new File("c:\\data.txt")); // the c is where it is located 
        // int s; 
        // while(in.hasNextInt()) {
          //   s = in.nextInt(); 
          //   System.out.println(s); 
       //  }
     //    in.close(); 
   //  }
     try {
         // open file for writing 
         Scanner in = new Scanner("c:\\output.txt"); 
         PrintWriter pw = new PrintWriter("c:\\output.txt"); 
         // write "hello world" in the output.txt file on the computer stuff
         pw.println("Hello world"); 
         // close the file - VERY IMPORTANT 
         pw.close(); 
     }
     catch (FileNotFoundException f) {
         System.out.println("cant open file ");
     }
       
    }  
}
