/*
 * IUi.java
 * 
 * Copyright 2009-2010 Joaquim Laplana, Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

package dev.orboan.ipAdresses1;

// Per establir associacions
import java.math.BigInteger;

/**
 * Modelizes the interface UI-Controller.
 */
public interface IUi {

    /**
     * Reads number of fields of the IP address.
     * 
     * @return number of fields
     */
    int readNumberOfFields();

    /**
     * Reads number of bits of each field of the IP address.
     * 
     * @return number of bits
     */
    int readNumberOfBits();

    /**
     * Writes IP capacity.
     * 
     * @param c IP capacity
     */
    void writeCapacity(final BigInteger c);

    /**
     * Writes a validation error
     */
    void writeValidationError();
}
