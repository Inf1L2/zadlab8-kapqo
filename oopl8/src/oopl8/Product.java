/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopl8;

/**
 *
 * @author Student
 */
public abstract class Product {
    
    private double price;
    private String name;
    private String describe;

    public Product(double price, String name, String describe) {
        this.price = price;
        this.name = name;
        this.describe = describe;
    }
    
    public String getDescribe(){
     return describe;   
    }
    
    public void setDescribe(String describe){
     this.describe = describe;   
    }

    public String getName(){
     return name;   
    }
    
    public void setName(String name){
     this.name = name;   
    }
    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public abstract void buy();

    public abstract void showInfo();
   
    
}
