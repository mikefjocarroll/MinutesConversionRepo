package org.example;

import java.util.Scanner;

public class Main {
    // Write a program that accepts an integer number of minutes from a user
    // and converts it both to hours and days.
    // For example, 6000 minutes equals 100 hours and equals 4.167 days

    public static void main(String[] args) {

        //Declare varaibles
        int userMinutes;
        float hours;
        float days;

        // Gather user's input (in minutes)
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Please enter amount of minutes to be converted:");
        userMinutes = inputDevice.nextInt();

        //caclucate hours and days from user's minutes
        hours = userMinutes / 60;
        days = hours/24;

        //Display output back to user
        System.out.println(userMinutes + " minutes is equal to " + hours + " hours");
        System.out.println(userMinutes + " minutes is equal to " + days + " days");



    }
}