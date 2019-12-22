package day05_Nov14Thu;

import java.util.Scanner;

public class c_UseScanner_ConvertTempsTimeSalaryShopping {

    public static void main(String[] args) {
//temp converter
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the temperature there in F?");
        double fahrenheit = scan.nextDouble();

        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("fahrenheit "+ fahrenheit+ " is " + celsius + " in celsius.");


        //Task3 time converter - convert days to minutes;
        Scanner time = new Scanner(System.in);
        System.out.println("how many days do you want to calculate?");

        int minutesInHour = 60;
        int hoursInDay = 24;
        double days = scan.nextDouble();
        double minutesInDay = days * minutesInHour* hoursInDay;

       // System.out.println(scan.nextDouble() = minutesInDay );

        //Task 4 hourly wage generaty yearly salary with 2080 hours time converter
        //


        /*Task 5 Grocery shopping
        price of tomatos and store it
        how many tomatoes and store it
        total price of tomatoes
               potato price
               bananas
               etc
         */

    }
}
