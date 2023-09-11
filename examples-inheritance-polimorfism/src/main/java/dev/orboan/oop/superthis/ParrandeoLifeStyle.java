/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.orboan.oop.superthis;

/**
 *
 * @author Oriol
 */
public class ParrandeoLifeStyle extends LifeStyle {

    private boolean wannaHide;
    
    //Next field hides itself from superclass
    //so using 'this' or 'super' here makes the difference
    private final String HEADER = "My Parrandeo LifeStyle: \n"
                + "--------------\n"
                + "My underground activities are... \n";

    public ParrandeoLifeStyle(boolean wannaHide) {
        //The call to superclass' constructor initializes the usualLifeStyle
        //array when you wanna hide your underground lifestye
        //(The call to super() MUST be always the first sentence
        //in subclasses' constructors, when used)
        super(!wannaHide); 
        
        //To be used by the toString method
        this.wannaHide = wannaHide;
        
        //When you don't wanna hide your underground lifestyle
        //the contructor from superclass hasn't initialized the usualLifeStyle array
        //so usualLifeStyle is null, therefore it's initialized here:
        if (this.usualLifeStyle == null) {
            //Using 'this.ARRAY_LENGTH' here makes no difference because
            //this constant is inherited and not hidden by another field
            //with the same name
            //The same rule applies to 'super.usualLifeStyle'
            super.usualLifeStyle = new String[super.ARRAY_LENGTH];
            this.usualLifeStyle[0] = "Going to parties";
            this.usualLifeStyle[1] = "Hangin' out";
            this.usualLifeStyle[2] = "Enjoying pubs and discos";
            this.usualLifeStyle[3] = "Drinking (lots)";
            this.usualLifeStyle[4] = "Going crazy";
            this.usualLifeStyle[5] = "Swingering";
        }
    }

    @Override
    public String toString() {
        String la;
        if (this.wannaHide) {
            la = "Hiding my secret lifestyle...\n";
            //Calling the toString method of superclass
            //In this case, the usualLifeStyle array's been initialized by the superclass
            la += super.toString();
        } else {
            //Different than super.HEADER, because superclass' field is hidden
            //by a subclass' field with the same name
            la = this.HEADER;
            for (int i = 0; i < this.usualLifeStyle.length; i++) {
                la += "- " + this.usualLifeStyle[i] + "\n";
            }
        }
        return la;
    }
}
