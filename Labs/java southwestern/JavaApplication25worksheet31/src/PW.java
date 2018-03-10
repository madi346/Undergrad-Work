/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SWC-Student
 */
import java.io.FileNotFoundException; 
import java.io.PrintWriter; 
//import java.util.Scanner; 
public class PW {
    try {
    PrintWriter pw = new PrintWriter("c:\\output.txt"); 
    // write the statement below this comment //\\
    //Scanner in = new Scanner(new File("c:\\output.txt")); 
    pw.println("hello world"); 
    pw.close(); 
}
    catch(FileNotFoundException n) {
    System.out.println("Cant open file");  
} 
}
