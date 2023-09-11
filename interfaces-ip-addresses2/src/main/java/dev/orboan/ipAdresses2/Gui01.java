/*
 * Gui01.java
 * 
 * Copyright 2009-2010 Joaquim Laplana, Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 * 
 */

package dev.orboan.ipAdresses2;

import javax.swing.*;
import java.math.BigInteger;
import java.text.NumberFormat;

/**
 * Modelizes an UI implementing a basic Graphical User Interface. *
 */
public final class Gui01 implements IUi {

    /** Visibility to the controller. */
    private Controller c;

    /**
     * Constructor.
     */
    private Gui01() {
        this.createController();
        this.c.interactUser();
    }

    /**
     * Creates Controller object.
     */
    private void createController() {
        this.c = new Controller(this);
    }

    @Override
    public int readNumberOfFields() {
        final String str = JOptionPane.showInputDialog(null, "Nombre de camps Z[1, 8]", 4);
        final int nf = Integer.parseInt(str);
        return nf;
    }

    @Override
    public int readNumberOfBits() {
        final String cad = JOptionPane.showInputDialog(null, "Nombre de bits Z[1, 16]", 8);
        final int nb = Integer.parseInt(cad);
        return nb;
    }

    @Override
    public void writeCapacity(final BigInteger c) {
        final NumberFormat nf = NumberFormat.getInstance();
        JOptionPane.showMessageDialog(null, "Nombre màxim de màquines connectables\nal sistema IP : " + nf.format(c));
    }

    @Override
    public void writeValidationError() {
        JOptionPane.showMessageDialog(null, "Les dades d'entrada no son valides.");
    }

    /**
     * Main program. Initializes the interaction with the user.
     * 
     * @param args Not used.
     */
    public static void main(final String[] args) {
        new Gui01();
    }
}
