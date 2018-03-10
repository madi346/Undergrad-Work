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
        printCost(11.01, 23); 
        printCost(110.23, 99); 
        printCost(.01, 200); 
        
        int x1 = w(3);
int x2 = r( w(2) );
System.out.println(" x1 is " + x1);
System.out.println(" x2 is " + x2); 
        
        
        
        
    }
    public static void displayAsterick(int n) {
        for (int k = 1; k <= n; k++) {
            System.out.print("*"); 
        }
    }
    public static void printCost(double price, int numItems) {
        System.out.println("the cost is $" + price*numItems);
        // $ means $2.0 , $%1.2f\n (new line \n) and System.out.printf("the cost is $&1.2\n" , price*numItems
        // for $2.00 
    }
	public static int sum(int a) {
		a = 11; 
		return a;
              
	}
public static int w(int x)
{
 return x*x + x%2;
}
public static int r(int x)
{
 return 4*( w(x) + 1 );
} 
}
    