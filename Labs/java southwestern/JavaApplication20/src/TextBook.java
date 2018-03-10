/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SWC-Student
 */
public class TextBook extends Book { 
    public static void main(String[] args) {
        
    }
    private String subject; // what is this do
    public TextBook(String author, String title, String subject) {
        // use the constructor in the parent class the book class to set the author and the title 
        // kind of like the types of vehicles like cars and motorcycles. 
        super(author, title); // Constructor in the parent class
        // the super(author, title) extends the constructor from the parent class to here 
        this.subject = subject; // do the new variable constructor like normal
    }
    public String getSubject() { // accessor method for subejct 
        return subject; 
    }
    public void setSubject( String subject) {
        this.subject = subject; 
    }
    // override rthe toString method in the Book class
   // super.toString() returns the value from the toString() method in the book class
   // this is the method, same signature but diff somethig else in the {} curly brackets
    // this is @override, OVERRIDING 
    public String toString() {
        return super.toString() + "Subject = " + subject; 
    }
    
}
