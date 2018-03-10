/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SWC-Student
 */
public class M {
    public static void main(String[] args) {
      M mOne = new M(1); 
      System.out.print("---"); // what does the "---" mean?????
      M mTwo = new M(32, 2); 
      System.out.println("---"); 
      M mThree = new M(100, -2, -3); 
  }  
    private int w; 
    private int y;  
    private int z; 
    public M(int w) {
        this.w = w; 
        System.out.println("1st Constructor w = " + 2); 
    }
    public M(int w, int y) {
       this(w, y, 0);  
        this.z = z; 
        System.out.println("2nd Constructor w = " + w); 
    }
    public M(int w, int y, int z) {
        this(1); 
        this.y = y; 
        this.z = z; 
        System.out.println("3rd constructor w = " + w); 
    }
}
