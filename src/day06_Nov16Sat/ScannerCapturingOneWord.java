package day06_Nov16Sat;

import java.util.Scanner;

public class ScannerCapturingOneWord {
    public static void main(String[] args) {

        Scanner blabla = new Scanner(System.in);

        System.out.println("What is your name?");

        //next line method of Scanner is used to capture whole line
        // use "nextLine" in the value statement of the string variable

        String name = blabla.nextLine ();
        System.out.println("You have entered: "+name);


        // Task 4
        // use nextLine to ask your bio
        // whats your name
        // which city you live in , including state , Tyson, VA
        // What is your street address

        System.out.println("What city and state do you live in?");
        String cityState = blabla.nextLine ();
        System.out.println("You have entered: "+cityState);

        System.out.println("What is your street address?");
        String streetAddress = blabla.nextLine ();
        System.out.println("You have entered: "+streetAddress);

        //nextline is triggered by hitting enter


    }
}
