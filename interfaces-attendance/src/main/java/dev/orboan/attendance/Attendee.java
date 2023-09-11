/*
 * Attendee.java
 *
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

package dev.orboan.attendance;

import org.joda.time.DateTime;

/**
 * Simulates attendance.
 */
public interface Attendee {
    public int absences(DateTime day1, DateTime day2);
}
