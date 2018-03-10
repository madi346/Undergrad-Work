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
// week twelve 12 player demo base class 
public class Player {
    // attributes  AKA properties, field variables, or instance variables 
    // protected access allows any derived class access to these variables 
    protected int number; 
   protected String name;  

   // default constructor  after doing the protected thing 
   // default constructor has no parameters, things between the {} 
   // check none of them 
    public Player() {
        // to do: anything needed to get this object ready for use when instantiated 
        number = 0; 
        name = ""; 

    }
   
    // check all of them 
    // custom constructor has parameters. We can have as many custom constructors as we want or as needed 
    public Player(int number, String name) {
        this.number = number;
        this.name = name;
    }
   
   // getters and setters is next 
// check all of them 
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        // the whole idea of having a setter method is that we can control access to our variable or attribute 
        // and apply some validation rules 
        // in this case, player number must be between 0 and 99 , this is a logical operator 
        if (number >= 0 && number < 100) {
            // true - we can go ahead and set the property
             this.number = number;
        }
        else {
            // default to 0
            // fast forward to chapter 10, we could also throw an expection into this  
            this.number = 0; 
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
  // instance method - usually called public
    public String getPlayerInfo() {
        // declare string variable 
        String result = ""; 
        
        // do some string concatenation
        result = "Player Name: " + name + "Number: " + Integer.toString(number); 
        
        // DONT FORGET THE RETURN STATEMENT !!!!!!!!  
        return result; // lots of other names for instead of result here 
    }
    
} // end player class 
// no code after this curly brace 
