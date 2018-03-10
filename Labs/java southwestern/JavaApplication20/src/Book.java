/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SWC-Student
 */
public class Book {
    public static void main(String[] args) {
        
    }
    private String title; // instance variable
    private String author; // instance variable 
    public Book(String title, String author) {
        // constructor 
        this.title = title; 
        this.author = author; 
    }
    public String getAuthor() {
        return author; 
    }
    public String getTitle() {
        return title; 
    }
    public void setAuthor(String author) {
        this.author = author; 
    }
    public void setTitle(String title) {
        this.title = title; 
    }
    // idk what this part is
    public String toString() {
        // returns the state of the object 
        // i think like printing it out 
        // this is the method 
        return "Author = " + author + "Title = " + title; 
    } 
}
