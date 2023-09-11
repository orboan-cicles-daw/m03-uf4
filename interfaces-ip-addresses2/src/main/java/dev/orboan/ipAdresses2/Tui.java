/*
 * Tui01.java
 * 
 * Copyright 2009-2010 Joaquim Laplana, Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 * 
 */

package dev.orboan.ipAdresses2;

import java.math.BigInteger;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Modelizes an UI implementing a Text User Interface.
 */
public final class Tui implements IUi {

    /** Visibility to the controller. */
    private Controller c;

    /**
     * Constructor.
     */
    private Tui() {
        this.createController(); // Automessage to create the Controller object
        this.c.interactUser(); // Message sent to Controller object to be able to interact with the user
    }

    /**
     * Creates Controller object.
     */
    private void createController() {
        this.c = new Controller(this); // Message to Controller class to create a Controller object
    }

    @Override
    public int readNumberOfFields() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre de camps Z[1, 8](4) ? ");
        String nfS = sc.next();
        int nf = Integer.parseInt(nfS);
        return nf;
    }

    @Override
    public int readNumberOfBits() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre de bits Z[1, 16](8) ? ");
        String nbS = sc.next();
        int nb = Integer.parseInt(nbS);
        return nb;
    }

    @Override
    public void writeCapacity(BigInteger c) {
        final NumberFormat nf = NumberFormat.getInstance();
        System.out.print("Nombre màxim de màquines connectables al sistema IP: " + nf.format(c));
    }

    @Override
    public void writeValidationError() {
        System.out.print("Les dades d'entrada no són vàlides.");
    }

    /**
     * Main program. Initializes the interaction with the user.
     * 
     * @param args Not used.
     */
    public static void main(final String[] args) {
        new Tui();
    }

}