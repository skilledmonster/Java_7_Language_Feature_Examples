package com.skilledmonster.calendar.examples;

import java.util.Calendar;

/**
 * Demonstrate the new methods added for Calendar class in Java 7
 *
 * @author Jagadeesh
 */
public class GetWeekOfYearAndNumberofWeeks {

    public static void main(String[] args) {
        // get an instance of Calendar class. This is normally a GregorianCalendar
        Calendar cal = Calendar.getInstance();

        // check if this Calendar supports week date [GregorianCalendar does support week date]
        if (cal.isWeekDateSupported()) {
            // display number of weeks in the current year
            System.out.println("Number of Weeks in this Year: " + cal.getWeeksInWeekYear());
            // display current week number
            System.out.println("Current Week Number: " + cal.get(Calendar.WEEK_OF_YEAR));
            // display current week year
            System.out.println("Current Week Year: " + cal.getWeekYear());
        }
    }
}
