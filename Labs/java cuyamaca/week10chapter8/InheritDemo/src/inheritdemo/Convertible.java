/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritdemo;

/**
 *
 * @author madison.hubbard
 */

// in Jsva extends shows we're inheriting from the Car Class in this case 
// dont have to do make model color price etc. again because its already in Car
public class Convertible extends Car {
    // add the additional property to indicate if top is down or not (BOOLEAN)
    private boolean isTopDown; 
    
    
    // DEFAULT CONSTRUCTOR
    // right click and do constructor,
// click the car on left hand side, only that
    public Convertible() {
        // call the inherited constructor
        super(); // page 324 
        
        isTopDown = false; 
    }
    
    // CUSTOM CONSTRUTCOR 
    // click everything but the car on left hand side 

    public Convertible(boolean isTopDown, String VIN, String make, String model, String color, float price) {
        // calls the custom inherited constructor 
        super(VIN, make, model, color, price);
        this.isTopDown = isTopDown;
    }
    
    // getter and setter 
    // click on all of them!!
    public boolean isIsTopDown() {
        return isTopDown;
    }

    public void setIsTopDown(boolean isTopDown) {
        this.isTopDown = isTopDown;
    } 
    
    // override the getCarInfo method 
    // you just make it public...
    @Override // this is the override annotation. it gives us a heads up that we are overriding something 
    public String getCarInfo() { 
        String result = "NO"; 
        String carInfo = ""; 
        // call the inherited version of this method and then add some behavior 
        // if the top is down 
        carInfo = super.getCarInfo(); 
        
        // add some behavior for if the top is down 
        if (isTopDown) {
            result = "YES"; 
        }
     
        
        
        return carInfo + " Is top down? " + result; 
    }   
    
    
    
} // end convertible class 
