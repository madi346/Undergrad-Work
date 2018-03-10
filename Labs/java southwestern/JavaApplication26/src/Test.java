/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SWC-Student
 */
public class Test implements Describable {
    public String describeClass() {
        return "Test"; 
    }
   public static void display(Describable d) {
       String str = d.describeClass(); 
       System.out.println(str); 
   }
  // public static void main(String[] args) {
   W w = new W(); 
   display(w); // displays "this is class w"
   S s = new S(); 
   display(s); // display "this is class s"   
} 
} 
