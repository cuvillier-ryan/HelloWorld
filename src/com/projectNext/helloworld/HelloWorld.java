package com.projectNext.helloworld;

public class HelloWorld {

    public static void printYearsAndDays(long minutes){

        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = minutes / 525600;
            long minutesRemaining = (minutes - (years * 525600));
            long daysRemaining = minutesRemaining / 1440;

            System.out.println(minutes + " min = " + years + " y and " + daysRemaining + " d");
        }
    }

    public static void printEqual(int x, int y, int z) {
        if(x < 0 || y < 0 || z < 0){
            System.out.println("Invalid Value");
        } else if (x == y && y == z){
            System.out.println("All numbers are equal");
        } else if (x != y && y != z && x != z){
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            if (temperature >= 25 && temperature <= 45) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            if (temperature >= 25 && temperature <= 35) {
                return true;
            }
            else {
                return false;
            }
        }
    }


}
