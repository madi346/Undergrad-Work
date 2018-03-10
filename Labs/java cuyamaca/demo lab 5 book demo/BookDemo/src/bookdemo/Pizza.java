/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookdemo;

/**
 *
 * @author madison.hubbard
 */
public class Pizza {
    // attributes AKA properties, field variables, fields, instance variables, class variable 
    // accesibility dataType variableName 
    // the string pizza because various values small med large, cheese or pepporoni
    private String pizzaType; 
    private String size; 
    // int because its one thing 
    private int qty; 
    private float price; 
    
    // constructors 
    // default 
    // right click and code, constructor and click nothing and that makes it a default consructor 

    public Pizza() {
        // to do: initialize field variables and anything else needed to get ready for operation
        pizzaType = ""; 
        size = ""; 
        qty = 0; 
        price = 0; 
    }
    
    // custom constructor 
    // right click  insert code and constructor and clixk on all the boxes. 

    public Pizza(String pizzaType, String size, int qty, float price) {
        this.pizzaType = pizzaType;
        this.size = size;
        this.qty = qty;
        this.price = price;
    } 
    
    // get and set methods next 
// right click and insert code, and getter and setter and click on all boxes 
    public String getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getQty() {
        return qty;
    }

    // setters allow us to add to validation when setting field variables 
    public void setQty(int qty) {
        // adding some validation code : quanity qty must be >= 0, so no negative pizzas 
        if (qty >= 0) {
        this.qty = qty;
        }
        else {
            qty = 0; // set a default value at 0
        }
    }

    public float getPrice() {
        return price;
    }
// add validation to the price, so the price is not negative
    public void setPrice(float price) {
        if (price >= 0) {
            this.price = price;
        } else {
            price = 0;
        } 
    }
    
    // now we are done with constructors a
  // code our instamce method 
    // returning the string 
    public String getPizzaInfo() {
        // calculate the total price or extended price = price * qty 
        float extPrice = price * qty; 
        
        String info = "Pizza type" + pizzaType + "Size" + size + "Qty" + Integer.toString(qty) + "Price: " + Float.toString(price ) + " Total: " + Float.toString(extPrice);  
   return info; 
        
    } 
    
    
    
    
} // end pizza class 
// no code here, below the curly braces 