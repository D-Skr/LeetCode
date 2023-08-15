package oca;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LDTtest {

    public static void main(String[] args) {
        System.out.println(LocalTime.now()); //11:37:02.616
        System.out.println(LocalDateTime.now()); //2023-08-15T11:37:29.406
        
        //RTE: java.time.DateTimeException: Invalid date 'JUNE 31'
        //System.out.println(LocalDate.of(2020, Month.JUNE, 31));
        
        System.out.println(LocalDate.of(2020, Month.JUNE, 29)); //2020-06-29
        
        //System.out.println(LocalDateTime.of(2010, 6, 13, 23, 60));
        /*
         * java.time.DateTimeException: Invalid value for MinuteOfHour (valid values 0 - 59): 60
         * at java.time.temporal.ValueRange.checkValidValue(ValueRange.java:311)
         * at java.time.temporal.ChronoField.checkValidValue(ChronoField.java:703)
         */
        
        System.out.println(LocalDateTime.of(2010, 6, 13, 23, 59));  //2010-06-13T23:59
        System.out.println(LocalDateTime.of(2010, 6, 13, 23, 59, 59));  //2010-06-13T23:59:59
    }

}
