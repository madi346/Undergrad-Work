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
public class Main {
    

    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in); 
        
        
        
        int num = 110; 
        if (num > 0 && num%5 == 0)
            System.out.println("True"); 
        
        int number = 34; 
        if (number < 0 || num%7 == 0) 
            System.out.println("true");
        else 
            System.out.println("false"); 
        
        //if (70 <= score && score < 100) 
         //   System.out.println("You passed!"); 
        
       // if ('a' < 'A')  
          //  System.out.println("A is bigger than a");
        
        char ch = '4'; 
	if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z'))
		System.out.println("alphabetic");
	else
		System.out.println("not alphabetic");

}
}