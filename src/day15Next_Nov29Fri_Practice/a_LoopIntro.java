package day15Next_Nov29Fri_Practice;
import java.util.Scanner;
public class a_LoopIntro {
    public static void main(String[] args) {
        /*Loops- First Lesson, Countdown to zero
        int apples = 1;
        while(apples <=10){
            System.out.println("Eating an apple:) ");
            apples++;  //this makes the statement false eventually; if you don't have this,
                        // it will be an infinite loop
        }
        System.out.println("No more apples:( ");
        //Lesson2 - print the number of the item you are counting
        if you want to keep track of which apple you are eating,
        //you can concatenate the variable into the print statement:
*/
       /* int apples = 1;
        while(apples <=10){
            System.out.println("I'm eating apple #"+apples);
            apples++;  //this makes the statement false eventually; if you don't have this,
            // it will be an infinite loop
        }
        System.out.println("No more apples:( ");

        /* Loops Lesson3 - Print numbers in a specified sequence.
        if you want to print numbers:
      --declare 2 variables: count and number
        give user instructions to enter a number
        setup a scanner to receive keyboard input
      --state that the variable called "number" is
        whatever int the user inputs from the keyboard
      --initialize the variable called "count" by making it equal to (start at) 1;
       make the condition statement using "while"
       "while" (as long as) the count is <= the number, THEN{
       print the count.
       if you want to print the numbers on the same line, use "print" instead of "println"
       -- tell it to keep adding 1 to the count by saying count++ (this is the update statement)
       then close the statement with }
       OR if you want to print ever other number, use count+=2
       every fifth number, use count +=5, etc
       OR you can start the count from zero (or anywhere).
        */

//        int count, number;
//        System.out.println("Enter a number: ");
//        Scanner keyboard = new Scanner(System.in);
//        number = keyboard.nextInt();
//        count = 0;
//        while(count<=number){
//            System.out.print(count+ ", ");
//            count+=5;
//        }
//        System.out.println("Finished printing numbers from 1 to "+number);

        /* Lesson 4 Sum of Positive Integers
        ask the user to enter a number, then another number
        the program will continue adding the numbers unless the user
        enters a negative number.  then it will stop.
         */

        Scanner keyboard = new Scanner(System.in);
        int total = 0;
        System.out.println("Enter a positive or negative integer: ");
        int nextNum = keyboard.nextInt();
        while(nextNum >0){
            total = total + nextNum;
            nextNum = keyboard.nextInt();
        }
        System.out.println("Sum of all the positive numbers you entered is: "+total);


    }
}
