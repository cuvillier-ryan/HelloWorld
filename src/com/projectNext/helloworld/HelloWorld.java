package com.projectNext.helloworld;

public class HelloWorld {

    public static void printYearsAndsDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        } else {
            long hours = minutes / 60;
//            long days = hours / 24;
//            long years = days / 365;
//            if(days >= 365) {
//                days = 0;
//            }
//            System.out.println(minutes + " min = " + years + " y and " + days + " d");
            System.out.println(hours);
        }
    }
}
