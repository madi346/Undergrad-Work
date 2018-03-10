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
     public static void main(String[] args){
      Scanner in = new Scanner(System.in); 
      
      
      
	//int i = 1;
	//while (i <= 3)	{
	//	System.out.println(i);
	//	i++; //Critical statement
	
        
	//System.out.println(" end of the loop"); 

        
	//int i = 1;
	//while (i <= 3)
	//{
	//	i++; // if you get rid if thislike the whole entire i++ then it runs forever 
	//	System.out.println(i);
	//}
        
        
       // int i = 1; 
     //   while (i <= 10000); //Semicolon ends the loop, i think this means that it wont run 
//{
	//System.out.println(i); //Not in the loop
	//i++;
//} 
 
       
	//System.out.println("Enter positive radius ");
	//radius = in.nextDouble();
	//while (radius < 0){
	//	System.out.println("Enter POSITIVE radius: ");
	//	radius = in.nextDouble();
	//}

        
	//String str = "hello";
	//char ch;
	//int index = str.length()-1; 
	//while (index > -1){
		//ch = str.charAt(index);
		//System.out.print(ch);
		//index --;
	//}

	//int i = 0;
	//while (i <= 10){
		
		//if (i != 5)
	 // this skips and doesnt print out the value i below so it skips 5
                // not something you want to do ina program so make it be !=
		//System.out.println(i);
              //  i++; 
	


	//int sum = 0;
	//while (sum < 100000){
		//if (i < 0)
		//	break;
		//sum = sum + i;
		//System.out.println("Enter an integer: ");
		//i = in.nextInt();
	//}
	//System.out.println("sum = " + sum); 

int i; 

do {
	System.out.println("Enter an even integer");
	i = in.nextInt();
} while( i%2 != 0 );
System.out.println("The even integer is " + i); 

//int a = 1;
//while (a <= 8){
 //System.out.println(" a = " + a);
 //a = a + 1;
//}

//int a = 2;
//while (a <= 8){
 //System.out.println(" a = " + a);
// a = a + 2;
//}

//int a = 2;
//while (a <= 13){
 //System.out.println(" a = " + a);
 //a = a + 3;
//}

//int a = 5;
//while (a <= 100){
 //System.out.println(" a = " + a);
// a = a + 5;
//}

//int a = 10;
//while (a <= 1000 && a%100 != 0){
 //System.out.println(" a = " + a);
// a = a + 10;
//}
System.out.println(23&7);
System.out.println(20 + "20");
System.out.println("x = " + 2 + 3);
System.out.println(1 + 5 + "x = " + 7);
System.out.println(10 + 3 + "x = " + 10 + 3);
System.out.println("The sum = " + 2 + (12 + 2));
System.out.println(1 + (14 + " is the sum ")); 

String s = " abcdef "; 
String a = "Mathematics"; 
String t = "programming"; 
s.length(); 
t.indexOf("gra"); 
a.charAt(3); 
a.substring(5); 
t.substring(2,3).equals("ro"); 
s.trim();  

     } 
}
     
     

