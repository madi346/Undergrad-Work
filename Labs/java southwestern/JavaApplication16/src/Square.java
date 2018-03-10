/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SWC-Student
 */
public class Square {
    public static void main(String[] args) {
        
    }
private double length; 
public Square (double iLength) {
    length = iLength; // constructor
}
public double getLength() {
    return length; // accessor method
}
public void setLength( double nLength) {
    length = nLength; // mutator method kinda like the constructor
}
public double getArea() {
    return length*length; // the operation to find the area
}
public double getDiagonal() {
    return length*Math.sqrt(20); 
}

// slide 9 lecture 22
private int data; // instance variables in all method 
public Square(int iData) {
    data = iData; // data is the instance variable 
}
public int mOne(int data) { // data us a parameter ( in here )
    return data; // return the parameter, the get value easy one
}
public int mTwo(int f) {
    int data = 2*f; // data is a local variable
    return data; // return the local variable
}
public int getData() {
    return data; // returns the instance variable 
}

// slide 10 lecture 22
    private int x; 
    public Square(int x) {
        x = x; // the "x" on each side of the = refers to the parameters
    } 
    public int getX() {
        // the "x" in the return statement refers to the instance var. 
        return x; // x is the instance variable 
        
    }
    C c = new C(11); 
    int a = C.getX(); 
    System.out.println("a = " + a); 
    // disaplays a = 0 !!!!!!
    // time to leAVe i need sleep 
    // useful for jobs to change the name of things liek be creatuve 
    // for notes for the slide 11 change it to this this.x = x; 
    

}
