/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author numbi
 */
public class NewClass {
    public static void main(String[] args) {
        int[] list = new int[10];
	list[0] = 90;
	int[] num;
	num = list;
	num[0	] = 1;
	System.out.println(list[0]);
	System.out.println(num[0]); 
    }
}
