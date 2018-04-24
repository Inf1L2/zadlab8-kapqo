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
public class Dlugopis extends Product{
    
            public Dlugopis(double price, String name, String describe) {
        super(price, name, describe);
    }
    
    
    @Override
    public void buy() {
        System.out.println(
                "I bought a blue pen");
    }

    @Override
    public void showInfo() {
        System.out.println(
                "Price:" + getPrice()
                + " Name:" + getName()
                + " Describe:" + getDescribe()
        );
    }
}
