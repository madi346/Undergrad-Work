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
        
    }
    String str = "hello"; 
    Object o = str; 
    // so theres no error message see slide 4 lecture 28
    //Integer x = new Integer(5); 
    //Object o = x; 
    //String str = o; 
    Car cOne = new Car(); 
    Vehicle v = cOne; // assign a child object to a parent 
    Car cTwo = (Car) v; // assign the parent object to a child
    // casting example the car /vehicle 
   // This is an error you can fix it somehow w/instanceOf
  //  Bicycle b = new Bicycle(); 
  //  Vehicle v = b; 
  //  Car cTwo = (Car) v; 
    
    // I N S T A N C E O F 
  //  Bicycle b = new Bicycle(); 
   // Vehicle v = b;  
// assign a Bicycle object to v
   // if (v instanceof Car) { // false 
    //Car cTwo = (Car) v; // cast v to a car object 
//}
    
    // instanceof cast safely
    
   // Object obj = "hello"; 
    //if (obj instanceof String) {
    //String str = (String) obj; 
    //System.out.println(str.length()); 
//}
    String s = new String("cat"); 
    String t = new String("cat"); 
    boolean g = (s == t); // assign false to g bc something of the == 
    boolean f = t.equals(s); // assign true to f this makes them equal to each other hence the name 
    
    
    public boolean equals(Object o) {
        Person that = (Person) o; // cast
        return that.firstName.equals(this.firstName) && 
                that.lastName.equals(this.lastName) &&
                that.age == this.age; 
    }
} 
