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
public class Ksiazka extends Product{
    
        public Ksiazka(double price, String name, String describe) {
        super(price, name, describe);
    }
    
    
    @Override
    public void buy() {
        System.out.println(
                "I bought a black book, named 'Lśnienie'");
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
