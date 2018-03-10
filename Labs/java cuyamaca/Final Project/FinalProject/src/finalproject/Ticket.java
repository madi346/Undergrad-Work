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
public class Ticket extends Object {
    // make public by use for other classes 
    public static final int MAX_DEST = 10; 
    
    // parallel lookup arrays 
    private final int[] destinations = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
    private final float[] fares = {65.00f, 45.00f, 35.00f, 75.00f, 85.00f, 75.00f, 
        125.00f, 95.00f, 55.00f, 40.00f}; 
    private final String[] destNames = {"Palm Springs", "Borrego", "Carlsbad", 
        "Los Angeles", "Las Vegas", "Laughlin", "Reno", "Mammoth", 
        "Big Bear", "El Centro"}; 
    
    public Ticket() {
        super(); 
    } // end of constructor 
    
    public void calcFare(Passenger myPassenger) throws InvalidDestException {
        int index = MyUtils.findItem(destinations, myPassenger.getDestination()); 
        String ticket = ""; 
        float fare = 0; 
        
        if (index == -1) {
            // zone is not in the array - throw an exception 
            String msg = "Destination codes between 1 and " + 
                    Integer.toString(Ticket.MAX_DEST); 
            throw new InvalidDestException(msg); 
        }
        else { 
            fare = fares[index] * myPassenger.getPassengers(); 
            
            // issue the ticket 
            ticket = " Name: " + myPassenger.getLastName() + 
                    " Address: " + myPassenger.getAddress() + 
                    " Dest: " + destNames[index] + 
                    " No. in Party: " + Integer.toString(myPassenger.getPassengers()) + 
                    " Fare: " + MyUtils.formatNum(fare, "$#,##0.00"); 
            myPassenger.setFare(fare); 
            myPassenger.setTicket(ticket); 
        }
    } // end calcFare 
    

    
} // end Ticket class
