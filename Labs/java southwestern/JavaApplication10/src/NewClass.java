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
public class NewClass {
   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        
        
       double area = computeArea(11.0); 
       System.out.println("Square area is: " + area);
       area = computeArea(12.3); 
       System.out.println("Square area is: " +  area); 
       
       
      double dollar = dollarsToQuarters(21); 
       System.out.println("There are: " + dollar + " quarters in 21 dollars"); 
       
       double surfaceArea = 
       System.out.println("Surface area of a sphere is: " + surfaceArea); 
        
   int score = 1;
while ( score >= 0){
	System.out.print("Enter a score. To stop the process ");
	System.out.println("enter a negative number\n");
	score = in.nextInt();
       // if (score < 0) break; 
        if (score <= 0) {
 
	System.out.print("The grade for a score equal to ");
	System.out.println(score + ": " + computeGrade(score));
} 
        else {
            break; 
        }
}
  
        
        
    }
 public static double computeArea(double len) { 
     // method
        return len*len; 
            //double area; 
            //area = len*len; 
            //return area; 
      // you can also write this as return len*len; 
        } 

 public static char computeGrade(int score) {
       char grade; //grade is a local variable
	if (score >= 90)
		grade = 'A';
	else if (score >= 80)
		grade = 'B';
	else if (score >= 70)
		grade = 'C';
	else if (score >= 60) 
		grade = 'D';
	else //guarantees that grade is assigned a value
		grade = 'F';
	return grade; //return a char value
}
  public static double computeCircleArea(double radius) {
      // or this 
      //double area = 0; 
      //area = Math.PI*radius*radius; 
      //return area; 
      return Math.PI*radius*radius; 
  }

///////////////////////////////////////////////////////////////////////////////////////////////////
  ///////////////////////////////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
  //////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
  // worksheet for powerpoint 14 and lecture 14 and worksheet 


public static double dollarsToQuarters(double numberOfDollars) {
  //double area; 
            //area = len*len; 
            //return area; 
    double dollar; 
   dollar = numberOfDollars/0.25;  
   return dollar;
} 

public static double surfaceAreaSphere(double radius) {
    double surfaceArea; 
    surfaceArea = 4*Math.PI*radius*radius; 
    return surfaceArea; 
}
    








}
