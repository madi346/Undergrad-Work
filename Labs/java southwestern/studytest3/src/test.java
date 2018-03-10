/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SWC-Student
 */
public class test {
    //number 6 
    public static void main(String[] args) {
    int[] arr = {1,1,0,0,0,0}; 
    for (int j = 2; j < arr.length; j++) arr[j] += arr[j-2]+arr[j-1]; 
    for (int j = 0; j < arr.length; j++) 
    System.out.println("arr[" + j + "] = " + arr[j]); 
   

    } 
}
