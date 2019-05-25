package com.company.javaenum;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EnumMain {
//    enum Days {
//        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY;
//    }


    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter your option");
//        String input = scanner.next();
//        Days inputDays = Days.valueOf(input);
//        switch (inputDays) {
//            case SUNDAY:
//                System.out.println("This is sunday and its ordinal value" + "i" + inputDays.ordinal());
//                break;
//            case MONDAY:
//                System.out.println("this is MONDAY");
//                break;
//            case TUESDAY:
//                System.out.println("this is tuesday");
//                break;
//
//
//        }
//        //why .name used
//        if (inputDays.equals(Days.SUNDAY.name())) {
//            System.out.println("this is sunday");
//        }
//
//        Days[] values = Days.values();
//
//        for (Days day : Days.values()) {
//            System.out.println(day.name());
//
//        }

        for( Days days : Days.values()){
            System.out.println(days.name()+ "" +days.getKey()+"" +days.getValue());
        }


    }


}
