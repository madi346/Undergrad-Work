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
       // for example 5 lecture 18
        double[] name = new double[3]; 
        name[0] = 5.0; 
        name[1] = 3.0; 
        name[2] = -0.1; 
        System.out.println("The sum of all the numbers is: " + computeSum(name)); 
        System.out.println("The smallest of all the numbers is: " + computeSmallest(name)); 
        System.out.println(binarySearch(1, )); 
       // int[] squared = new int[3]; 
        //squared[0] = 1; 
      //  squared[1] = 6; 
      //  System.out.println(squareArray(squared)); 
        
       // int[] search = new int[5]; 
       // search[0] = 0; 
       // search[1] = 1; 
        //search[2] = 2; 
       // search[3] = 7; 
       // System.out.println(binarySearch(search)); 
        
    }
    //for example 5 lecture 18
    public static double computeSum(double[] numbers) {
        double tmp= 0.0; // tmp will store the sum
        for(int kk = 0; kk < numbers.length; kk++) {
        tmp = tmp + numbers[kk]; 
        }
      return tmp; 
    } 
    // for example 6 lecture 18
    public static double computeSmallest(double[] r) {
        double tmp = r[0]; 
        for (int kk = 1; kk < r.length; kk++) {
            if (r[kk] < tmp) {
                tmp = r[kk]; 
            }
        } 
        return tmp; 
    }
    // for example 8 lecture 18 
    public static int[] squareArray(int[] x) {
        int len = x.length; 
        int[] square = new int[len]; 
        for (int kk = 0; kk < x.length; kk++) {
            square[kk] = x[kk]*x[kk]; 
        }
        return square; 
    }
    public static int binarySearch(int key, int[] data) {
	int location = -1, lo = 0, hi = data.length-1, mid;
	while (lo <= hi && location == -1) { // hi is the size of array minus 1 
		mid = lo + (hi - lo) / 2; //Average of lo and hi
		if (key < data[mid]) {
			hi = mid - 1; //key is located between lo and mid-1;
		} else if (key > data[mid]) {
			lo = mid + 1; //key is located between mid+1 and hi;
		} else {
			location = mid;
		}
	}
	return location;
}
 
}

