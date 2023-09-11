/*
 * Teacher.java
 *
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

package dev.orboan.attendance;

import org.joda.time.DateTime;

/**
 * Modelizes a teacher
 */
public class Teacher extends Person implements Attendee {
    // Constructor
    public Teacher(String dni, String name) {
        super(dni, name);
    }

    @Override
    public int absences(DateTime day1, DateTime day2) {
        // Here we'd add instructions to calculate teacher's attendance.
        // The following result is fictitious.
        return 25;
    }

}
