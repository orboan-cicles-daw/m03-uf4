/*
 * Fui.java
 * 
 * Copyright 2009-2010 Joel Molins, Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

package dev.orboan.ipAdresses2;

// Per establir associacions
import java.math.BigInteger;
import java.text.NumberFormat;

/**
 * Modelizes a UI using text files.
 */
public final class Fui implements IUi {

    private Controller c;

    /**
     * Constructor.
     */
    private Fui() {
        this.createController(); // Automessage to create Controller object
        this.c.interactUser(); // Message to Controller object to call the method that interacts
                               // with the user
    }

    /**
     * Creates Controller object.
     */
    private void createController() {
        this.c = new Controller(this); // Creates a Controller object
    }

    @Override
    public int readNumberOfFields() {
        Reader r = new Reader("input.csv");
        r.readLine();
        final String str = r.readLine();
        final String[] fields = str.split("\\s+");
        final int nc = Integer.parseInt(fields[0]);
        r.close();
        return nc;
    }

    @Override
    public int readNumberOfBits() {
        Reader r = new Reader("input.csv");
        r.readLine();
        final String str = r.readLine();
        final String[] fields = str.split("\\s+");
        final int nb = Integer.parseInt(fields[1]);
        r.close();
        return nb;
    }

    @Override
    public void writeCapacity(final BigInteger c) {
        final NumberFormat nf = NumberFormat.getInstance();
        Writer w = new Writer("output.csv");
        w.print("Nombre màxim de màquines connectables al sistema IP: " + nf.format(c));
        w.close();
    }

    @Override
    public void writeValidationError() {
        Writer w = new Writer("oputput.csv");
        w.print("Les dades d'entrada no són vàlides.");
        w.close();
    }

    /**
     * Main program. Initializes the interacton with the user.
     * 
     * @param args Not used.
     */
    public static void main(final String[] args) {
        new Fui();
    }
}