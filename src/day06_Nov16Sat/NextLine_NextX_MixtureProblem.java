package day06_Nov16Sat;

import java.util.Scanner;

public class NextLine_NextX_MixtureProblem {
    public static void main(String[] args) {

        Scanner blabla = new Scanner (System.in);

        System.out.println("What's your name?");
        String name = blabla.nextLine();
        System.out.println("My name is " + name);

        //if you use int, then you have to use nextInt, and then it won't
        //continue to the next LINE

        System.out.println("What's your age?");
        int age = blabla.nextInt();
        //when the inputter hits enter it will show the age and the address question,
        //then it will accept the "enter" as a response to the next "nextLine", below.
        //so the following will work - this is a fix for an "accidental capture"
        blabla.nextLine();
        // save age as a string:
        //String age = blabla.nextLine();
        System.out.println("My age is " + age);

        System.out.println("What's your address?");
        String address = blabla.nextLine();
        System.out.println("My address is " + address);



    }
}
