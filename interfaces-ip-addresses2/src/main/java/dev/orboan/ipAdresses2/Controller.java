/*
 * Controller.java
 * 
 * Copyright 2009-2010 Joaquim Laplana, Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

package dev.orboan.ipAdresses2;

import java.math.BigInteger;

public final class Controller {

    /** Visibility to UI. */
    private IUi iui;

    // Constructor
    public Controller(final IUi iui) {
        this.iui = iui;
    }

    /**
     * Calls user interface to interact with the user. Asks for the IP and shows its capacity.
     */
    public void interactUser() {
        // Ask the ui to read input data
        final int nc = this.iui.readNumberOfFields();
        final int nb = this.iui.readNumberOfBits();
        // Validate the data
        final boolean areValid = this.validateInputData(nc, nb);
        if (areValid) {
            final Ip ip = new Ip(); // Builds an Ip object
            final BigInteger c = ip.calculateCapacity(nc, nb); // Calculates the capacity
            this.iui.writeCapacity(c); // Writes the capacity
        } else {
            this.iui.writeValidationError(); // Writes an error
        }
    }

    /**
     * Validates input data.
     * 
     * @param nf number of fields
     * @param nb number of bits
     * @return true if data is valid, false otherwise
     */
    private boolean validateInputData(final int nf, final int nb) {
        final boolean areValid = 1 <= nf && nf <= 8 && 
                                 1 <= nb && nb <= 16;
        return areValid;
    }
}
