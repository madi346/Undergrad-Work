/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.awt.Window;

/**
 *
 * @author Madison
 */
public class Burrito {
  // private field variables 
    String name; 
    int  orderNo; 
    String burritoType; 
    float price; 
    int qty; 
    
    // default constructor 

    public Burrito() {
        // initialize the field variables 
        name = ""; 
        orderNo = 0; 
        burritoType = ""; 
        price = 0;
        qty = 0; 
    }

    // custom constructor 

    public Burrito(String name, int orderNo, String burritoType, float price, int qty) {
        this.name = name;
        this.orderNo = orderNo;
        this.burritoType = burritoType;
        this.price = price;
        this.qty = qty;
    }
    
     

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public String getBurritoType() {
        return burritoType;
    }

    public void setBurritoType(String burritoType) {
        this.burritoType = burritoType;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
    public String toString() {
        return " Name: " + name + " Order No: " + Integer.toString(orderNo) + " Burrito Type: " + burritoType 
                + " Price: " + MyUtils.formatNum(price, "$0.00") + " Qty: " 
                + Integer.toString(qty);  
    }
    
    
    
    
    
    
    
    
    
    
}// end public class burrito 
