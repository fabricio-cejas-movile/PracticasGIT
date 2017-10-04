package com.favrizzio.practicas.calendar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

public class Horas {

    public static void main(String[] args) {
        
        long insertedTime = 1495199080327L;
        
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Calendar calendar_ = Calendar.getInstance();
        calendar_.setTimeInMillis(insertedTime);

        System.out.println(dateFormat.format(calendar_.getTime()));

        Calendar calendar = new GregorianCalendar(2015, 0, 7, 00, 00, 00);

        Calendar calendar1 = new GregorianCalendar(2013, 0, 7, 00, 00, 00);

        System.out.println(calendar.getTimeInMillis());

        System.out.println(calendar1.getTimeInMillis());

        System.out.println(calculateNumberOfRenews(String.valueOf(calendar.getTimeInMillis())));

        Long newTime = Calendar.getInstance().getTimeInMillis();

        long diff = calendar.getTimeInMillis() - calendar1.getTimeInMillis();

        long hours = diff / (60 * 60 * 1000 * 24);

        long hours_ = TimeUnit.MILLISECONDS.toDays(diff);

        System.out.println("A:" + hours);

        System.out.println("B:" + hours_);

        Integer[] j = calculateNumberWeeks("03/12/2015", "11/04/2016");

        System.out.println("----> " + j[0] + " / " + j[1]);
    }

    private static Integer calculateNumberOfRenews(String activatedDate) {
        Integer result = 0;

        final Date activeDate = new Date(Long.parseLong(activatedDate));

        Integer daysCounter = 0;

        Calendar c = new GregorianCalendar();

        if (activeDate.after(c.getTime()))
            return result;

        while (c.getTime().after(activeDate)) {
            daysCounter++;
            c.add(Calendar.DAY_OF_MONTH, -1);
        }

        result = (daysCounter / 7) + 3; // This is the number of weeks (from the first day you are in week number one)

        return result;
    }

    /**
     * Calculate number of weeks between two dates
     * @param dateStatus
     * @param actualDate
     * @return Integer
     */
    public static Integer[] calculateNumberWeeks(String dateUserStatus, String actualDate) {

        Integer amountDaysWeek = 7;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dateUser = null;
        LocalDate dateNow = null;

        dateUser = LocalDate.parse(dateUserStatus, formatter);
        dateNow = LocalDate.parse(actualDate, formatter);

        Long weeks = ChronoUnit.WEEKS.between(dateUser, dateNow);

        Long days = ChronoUnit.DAYS.between(dateUser, dateNow);

        Integer dayye = days.intValue() - (weeks.intValue() * amountDaysWeek);

        Integer[] weekAndDays = {weeks.intValue(), dayye};

        return weekAndDays;
    }
}
