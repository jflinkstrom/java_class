package edu.JasonFlinkstrom.advancedjava.stock;

import javax.validation.constraints.NotNull;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Converts a String to a Calendar
 */
public class parseDate {

    @NotNull
    public static Calendar getParseDate(String calDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        Calendar calendar = Calendar.getInstance();
        try {
            Date date = sdf.parse(calDate);
            calendar.setTime(date);
        } catch (ParseException e) {
            System.out.println("Date entered must be in MM-dd-yyyy format");
        }
        return calendar;
    }
}
