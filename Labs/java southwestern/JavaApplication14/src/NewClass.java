/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SWC-Student
 */
import java.util.ArrayList; 
public class NewClass {
   public static void main(String[] args) {
       // LECTURE 19
       int rows = 3; 
       int cols = 4; 
       double[][] arr2Db4; // NO spaces 
       int[][] arr2D; 
       arr2Db4 = new double [rows][cols]; 
       arr2D = new int[rows][cols]; 
       for (int j = 0; j < rows; j++) { 
           for (int k = 0; k < cols; k++) {
               arr2Db4[j][k] = (int) (1.0 + 100.0*Math.random ()); 
               arr2D[j][k] = (int) arr2Db4[j][k]; 
               System.out.println("arr2Db["+j+"]["+k+"]="+arr2Db4[j][k]); 
               System.out.println("arr2D["+j+"]["+k+"]="+arr2D[j][k]); 
           }
       }
 
       
       
       
       
       // LECTURE 20 
       ArrayList<String> names = new ArrayList<>(); 
       names.add("Luke");
       names.add("Leia"); 
       names.add(1, "Joseph"); 
       names.add(2, "Mary"); 
       System.out.println(names); 
       System.out.println(names.size()); 
       String name1 = names.get(0); 
       String name2 = names.get(names.size() - 1); 
       System.out.println(name1); 
       System.out.println(name2); 
       
       ArrayList<String> days = new ArrayList<String>(); 
       days.add("Monday"); 
       days.add("Wednesday");
       days.add("Saturday"); 
       days.add(0, "Sunday"); 
       days.add(2, "Thursday"); 
       days.remove(0); 
       days.remove("Thursday"); 
       System.out.println(days); 
       
       // worksheet number 20
       ArrayList <String> list = new ArrayList <String>(); 
       list.add("C"); 
       list.add("A"); 
       list.add("E"); 
       list.add("B"); 
       list.add("D"); 
       list.add("F"); 
       list.add(1, "A2"); 
       list.remove(3); 
       list.remove("A2"); 
       list.size(); 
       System.out.println(list); 
       System.out.println(list.size()); 
       
       ArrayList <String> amethyst = new ArrayList <String>(); 
       amethyst.add("xyz"); 
       amethyst.add("cat"); 
       amethyst.add("book"); 
       amethyst.add(0, "ddd"); 
       amethyst.set(1, "biology"); 
       System.out.println(amethyst); 
       
       ArrayList <String> pearl = new ArrayList <String>(); 
       pearl.add("day"); 
       pearl.add("book"); 
       pearl.add("house"); 
       pearl.add(0, "math"); 
       String str = pearl.get(1); 
       pearl.set(1, str + "s"); 
       System.out.println(pearl); 
       
       
       
       
   }
}
