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

    public static void fizzBuzzJava(int num) {
        for (int i = 1; i <= num; i++)
        {
            if (((i % 3) == 0) && ((i % 5) == 0)) // Is it a multiple of 5 & 7?
                System.out.println("fizzbuzz");
            else if ((i % 3) == 0) // Is it a multiple of 5?
                System.out.println("fizz");
            else if ((i % 5) == 0) // Is it a multiple of 7?
                System.out.println("buzz");
            else
                System.out.println(i); // Not a multiple of 5 or 7
        }
    }


}
