/*
 * Ip.java
 * 
 * Copyright 2009-2010 Joaquim Laplana, Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

package dev.orboan.ipAdresses2;

import java.math.BigInteger;

public final class Ip {

    /**
     * Calculates the maximum capacity of IP addresses. c = (2^nb)^nf
     * 
     * @param nf number of fields
     * @param nb number of bits for each field
     * @return the capacity
     */
    public BigInteger calculateCapacity(final int nf, final int nb) {
        final BigInteger c = BigInteger.valueOf(2).pow(nb * nf);
        return c;
    }
}
