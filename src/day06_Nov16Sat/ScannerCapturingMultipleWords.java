package day06_Nov16Sat;

import java.util.Scanner;

public class ScannerCapturingMultipleWords {
    public static void main(String[] args) {

        Scanner blabla = new Scanner (System.in);

        System.out.println("What is your name?");

        String name = blabla.next();
        String anotherName = blabla.next();

        System.out.println ("You have entered " + name + " " +anotherName);

        System.out.println("What is your age?");
        int age = blabla.nextInt();

//we use nextLine to capture more than one word with the scanner
        //this is for capturing String data type

// it's also possible to use nextInt(), byte, etc for whole numbers and
// nextFloat, or nextDouble for fractionals
// nextBoolean is also used.
// but we don't use nextChar because it's the same as just using next?
// the problem with mixing "nextX()" and nextLine is that whenever you use nextLine after
// any other nextX() message is that it will accidentally capture the "Enter" keyboard
// action and create the confusion that the nextLine method is not working.
// the solution is to add another scan.nextLine to capture that keyboard input without saving it into a variable.
// ADVICE:  do not use scan.nextLine() unless you really need to capture more than one word


    }
}
