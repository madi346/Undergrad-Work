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
public class BookDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declare object variable ClassName varName 
       BookForm myForm = new BookForm(); // call the constructor method 
       
       // once we have a valid instance, we can then invoke or call the various
       // instance methods of our object
       // objVarname.methodName(whateverArgs) args means arguments
       
               myForm.setVisible(true); 
    }
    
}
