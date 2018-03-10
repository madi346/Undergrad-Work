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
// we are inheriting from player, so we need to make sure that we have the extends statement 
// extends tells the java compiler which class we are inheriting from 
public class FootballPlayer extends Player {
    // attributes 
    protected String position; 
    protected int gamesPlayed; 
    
    // constructors 
    // default aka no clicking 
    public FootballPlayer() {
        // call the inherited default constructor 
        super(); 
        
        // additional initialization 
        position = ""; 
        gamesPlayed = 0; 
    }

    
// custom constructor that calls the inherited and passes the appropriate arguments to the inherited constructor 
    public FootballPlayer(String position, int gamesPlayed, int number, String name) {
        // calls the custom inherited constructor 
        super(number, name);
        
        // additional initialization for our new properties, etc. 
        this.position = position;
        this.gamesPlayed = gamesPlayed;
    }

    // getters and setters - click all of them!! 
    
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
       //  to do: validate and dont allow a negative value 
        this.gamesPlayed = gamesPlayed;
    }
    
    // ovveride our getPlayerInfo() method 
    // optional override annotation is simply a head's up that we are overriding a method in teh parent class 
    
    @Override 
    public String getPlayerInfo() {
        String result = ""; 
        
        // call the inherited class getPlayerInfo() so we dont have to code getting the players name and number all over again 
        result = super.getPlayerInfo() + "Position: " + position + 
                "Games Played: " + Integer.toString(gamesPlayed);  
        
        
        return result; 
    } // end getPlayerInfo() 
    
} // end of Football Player class 
