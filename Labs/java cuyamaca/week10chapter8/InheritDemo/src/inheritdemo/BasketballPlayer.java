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
// extends tells the java compiler which class we are inheriting from 
public class BasketballPlayer extends Player {
    protected String position; 
    protected float freeThrowPct; 
    
    // defaukrt constructor check the super one 

    public BasketballPlayer() {
        // call the inherited constructor 
        super(); 
        
        
        // additional initialization 
        position = ""; 
        freeThrowPct = 0; 

    }
// click bottom of left and all of right side 
    public BasketballPlayer(String position, float freeThrowPct, int number, String name) {
        // call the inherited constructor first
        super(number, name);
        
        
        // and then add the additional behavior 
        this.position = position;
        this.freeThrowPct = freeThrowPct;
    }
            // getters and setters  - click all of them 

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getFreeThrowPct() {
        // to do: validate logoc 
        return freeThrowPct;
    }

    public void setFreeThrowPct(float freeThrowPct) {
        this.freeThrowPct = freeThrowPct;
    }
    
    // ovveride our getPlayerInfo() method 
    // optional override annotation is simply a head's up that we are overriding a method in teh parent class 
    
    @Override 
    public String getPlayerInfo() {
        String result = ""; 
        
        // call the inherited class getPlayerInfo() so we dont have to code getting the players name and number all over again 
        result = super.getPlayerInfo() + "Position: " + position + 
                "Free throw Pct: " + Float.toString(freeThrowPct);  
        
        
        return result; 
    } // end getPlayerInfo()  
    
    
    
    
} // end basketball player class 
