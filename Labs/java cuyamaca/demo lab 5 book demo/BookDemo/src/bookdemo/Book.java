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
// Java class decleration 
// Accessibility (public or private) usually always public 
// keyword class 
// class name (start with an upper case letter, Book, Car, Cat)
public class Book {
        // atributes AKA properties, fields, field variables, instance variables 
        // Accessibility (public, protected or private) these are normally declared private 
        // Java assumes private by default...if you forget, but best for clarity
        // data type (String, int, float, etc. )
        // variable name (Java convention is start with a lower case letter) 
        // normally initialized in the constructor 
    private String title; 
    private String author; 
    private String isbn; 
    private float price; 
    
    // code our instructors
    // see the class coding wizard in netbeans for help section on Blackboard 

    // default constructor 
    // constructors actualy covered in chapter 8 of textbook but lets learn to do things the right way
    public Book() {
        // to do: initialize instance variables and whatever else we need to do 
        // to get the object ready to operate 
        title = ""; 
        author = ""; 
        isbn = ""; 
        price = 0; // you can also use 0.0f because its a float 
    }
   
    // custom constructor (class wizard on netbeans help, select all of the boxes, so right click on bottom below and do constructor and click all of the boxes this time)

    public Book(String title, String author, String isbn, float price) {
        // page 275/276 the 'this reference' 
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }
    
    // getters and setters AKA accessors and mutators 
    // class wizard on netbeans help, HINT: use class coding wizard for  this)

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        // optional: code to validate length, etc. 
        // reason why we have setter methods 
        this.isbn = isbn;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    // user defined instance method to return a string with all of the books properties 
    public String getBookInfo() {
        String info = " ISBN: " + isbn + " Title: " + title + " Author: " + author + " Price: " + Float.toString(price); 
   return info; 
    } 
    
    
    
    
} // end curly brace, end Book class 
// no code here!!! 