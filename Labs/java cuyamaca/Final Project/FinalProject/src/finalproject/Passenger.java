/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author Madison
 */
public class Passenger extends Person {
    // constants and field variables 
    
    private int passengers; 
    private int destination; 
    private float fare; 
    private String ticket; 
    
    // default constructor 

    public Passenger() {
        // call the inhereted constructor 
        super(); 
        passengers = 0; 
        destination = 0; 
        fare = 0; 
        ticket = ""; 
    }
    
    // custom constructor 
   public Passenger( String lastName, String address, int passengers, 
           int destination) {
       // first call the inhereted constructor 
       super(lastName, address); 
       this.passengers = passengers; 
       this.destination = destination; 
   }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getDestination() {
        return destination;
    }

    public void setDestination(int destination) throws InvalidDestException {
        if (destination > 0 && destination <= Ticket.MAX_DEST) {
          this.destination = destination; 
        }
        else {
            String msg = "Destination codes between 1 and " + 
                    Integer.toString(Ticket.MAX_DEST); 
            throw new InvalidDestException(msg); 
        }
    }

    public float getFare() {
        return fare;
    }

    public void setFare(float fare) {
        this.fare = fare;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }
    
    
   
} // end of Passenger class
