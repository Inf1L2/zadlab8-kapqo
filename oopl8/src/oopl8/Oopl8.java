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
public class Oopl8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Car m = new Car(30000, "Mercedes", "w123") ;
        m.showInfo();
        Ksiazka ksiazka = new Ksiazka(24.99, "Ksiazka", "Lśnienie");
        ksiazka.showInfo();
        dzem dzem = new dzem(4.50, "Dzem", "wiśniowy");
        dzem.showInfo();
        Polopiryna polopiryna = new Polopiryna(10, "Polopiryna", "Extra");
        polopiryna.showInfo();
        Dlugopis dlugopis = new Dlugopis(2.99, "Dlugopis", "niebieski");
        dlugopis.showInfo();
        Czekolada czekolada = new Czekolada(5.49, "Czekolada", "karmelowa");
        czekolada.showInfo();
    }
    
}
