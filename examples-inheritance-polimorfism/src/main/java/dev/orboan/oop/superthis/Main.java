/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.orboan.oop.superthis;

/**
 *
 * @author Oriol
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Superclass LifeStyle:
        LifeStyle commonLifeStyle = new LifeStyle(false);
        System.out.println(commonLifeStyle.toString());
        
        //Subclass ParrandeoLifeStyle which is a type of LifeStyle:
        
        //Boolean true means "I wanna hide my parrandeo lifestyle
        //and show the 'usual' lifestyle to you"
        ParrandeoLifeStyle alternateLifeStyle = new ParrandeoLifeStyle(true);
        System.out.println(alternateLifeStyle.toString());
                
        //Boolean false means "I don't wanna hide my parrandeo lifestyle to you"
        alternateLifeStyle = new ParrandeoLifeStyle(false);
        System.out.println(alternateLifeStyle.toString());        
    }
}
