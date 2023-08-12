package com.example.javacourse;

import java.util.Calendar;
import java.util.Date;

// String and System Class are part of java.lang package

public class PrintDate {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        System.out.println(calendar);

    }
}
