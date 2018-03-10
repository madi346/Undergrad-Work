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
public class Car {
    // attributes AKA properties, field variables, fields, instance variables
    // protected is private access but makes these variables directly accesible in a child or derived class 
    protected String vin; 
    protected String make; 
    protected String model; 
    protected String color; 
    protected float price; 
    
    // constructors - default and custom 
// DEFAULT CONSTRUCTOR 
    public Car() {
        // you put things in here after doing the constructor 
        // to do: get out object before operation
        vin = ""; 
        make = "";
        model = ""; 
        color = "";
        price = 0; 
        
    }
    
    // custom constructor
    // If you dont like using the this referance, an alternative of this is to "mangle" 
    // or change the parameter name slightly, make the thing uppercase fyi or change the name, 
    // like VIN instead of vin 
    public Car(String VIN, String make, String model, String color, float price) {
        vin = VIN; // alternative code to set the property 
        this.make = make;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    // GETTERS AND SETTERS, RIGHT CLICK AND YAH CLICK ON ALL OF THEM 
    
    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
     
    public String getCarInfo() {
        // instead of assigning to a variable and returning, we simply just code a return statement 
        return " VIN: " + vin + " Make: " + make + " Model: " + model + " Color: " +
                color + " Price: " + Float.toString(price); 
    } 
    
} // end car class
