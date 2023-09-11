/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.orboan.oop.superthis;

/**
 *
 * @author Oriol
 */
public class LifeStyle {

    protected final int ARRAY_LENGTH = 6;
    protected String[] usualLifeStyle;
    protected final String HEADER  = "My LifeStyle: \n"
                + "--------------\n"
                + "My usual activities are... \n";

    public LifeStyle(boolean wannaHide) {  
        this.usualLifeStyle = (!wannaHide) ? this.initLifeStyle() : null;
    }

    private String[] initLifeStyle() {
        String[] lifeStyle = new String[this.ARRAY_LENGTH];
        lifeStyle[0] = "Go to School";
        lifeStyle[1] = "Go to work";
        lifeStyle[2] = "Visit my Family";
        lifeStyle[3] = "Trekking";
        lifeStyle[4] = "Diving";
        lifeStyle[5] = "Watch cinema";
        return lifeStyle;
    }

    @Override
    public String toString() {
        String la;
        if (this.usualLifeStyle != null) {
            la = this.HEADER;
            for (int i = 0; i < this.usualLifeStyle.length; i++) {
                la += "- " + this.usualLifeStyle[i] + "\n";
            }
        } else {
            la = "Unknown lifestyle...\n";
        }
        return la;
    }
}
