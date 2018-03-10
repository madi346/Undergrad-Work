/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SWC-Student
 */
public class Test {
    public static void main(String[] args) {
        A aOne = new A(1, 2, 3); 
        A aTwo = new A(1, 2); 
        A aThree = new A(1); 
    }
    // worksheet for lecture 23 part 1
        private int x; 
        private int y; 
        private int z; 
        public Test(int x, int y, int z) {
            // constructors 
            this.x = x; 
            this.y = y; 
            this.z = z; 
            System.out.println("Constructor 1"); 
        }
        public Test(int x, int y) {
            this(x, y, 0); 
            System.out.println("Constructor 2");
        }
        public Test(int x) {
            this(x, 0, 0);  
            System.out.println("Constructor 3"); 
        }
}
