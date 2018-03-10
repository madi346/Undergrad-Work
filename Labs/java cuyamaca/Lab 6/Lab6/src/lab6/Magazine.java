/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author Madison
 */
public class Magazine {
    // private field variables
    String title; 
    String subject; 
    float price; 
    String targetAudience; 
   
    // default constructor
public Magazine() {
 // initialize the field variables 
title = ""; 
subject = ""; 
price = 0; 
targetAudience = "";
}

// custom constructor
public Magazine(String title, String subject, float price, String targetAudience) {
this.title = title; 
this.subject = subject; 
this.price = price; 
this.targetAudience = targetAudience; 
}

public String getTitle() {
return title; 
} 
public void setTitle(String title) {
this.title = title; 
}
public String getSubject() {
return subject; 
}
public void setSubject(String subject) {
this.subject = subject; 
}
public float getPrice() {
return price; 
}
public void setPrice(float price) {
this.price = price; 
}
public String getTargetAudience() {
return targetAudience; 
}
public void setTargetAudience(String targetAudience) {
this.targetAudience = targetAudience; 
} 

public String toString() {
return " Title: " + title + " Subject: " + subject + " Target Audience: " + targetAudience 
+ " Price: " + MyUtils.formatNum(price, "$0.00");  
}
} // end public class Magazine 
