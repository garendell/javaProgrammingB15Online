package day05_Nov14Thu;

    //to use a scanner for capturing keyboard input, you need to
    // import the scanner utility, at this position: between package and class:
    // but first, you setup the question and variables (see below)

import java.util.Scanner;

public class d_UseScanner_NameAgeHeightOxfordCottage {
public static void main (String [] args){
    System.out.println("Hello, from Oxford Cottage!");

    //first, here is an example without using scanner:
    String myName = "Gala";
    System.out.println("My name is " + myName+"." );

//Steps for using the scanner:
    //1. Create scanner object
    //This declares a new variable; in this case it's called "scan" but you can name it whatever you want.
    //[Scanner] is the data type, [scan] is the variable name, [new Scanner (System.in)] is the value.

    Scanner scan = new Scanner(System.in);

    //2. Ask the question you want the keyboard user to answer:

    System.out.println("What's your name, my friend?");

    //3.  Declare the variable you want to capture; data type + name of variable + value[value for a scanner variable is "scan.next()"]
    String visitorName = scan.next ();

    //4.  Tell the system what to print, using the keyboard-input data:
    System.out.println("Welcome to Oxford Cottage, " + visitorName+"." );

  /* Suggested tasks:
    ask user for name
    and capture the result
    print your name is
*/
    System.out.println("Wait, what's your name, again?");
    Scanner input = new Scanner(System.in);
    String name =input.nextLine();
    System.out.println("Ok, got it! Your name is "+ name +"!");
    System.out.println("Welcome again to Oxford Cottage, " + name+"." );


/*
    ask user for birth year
    and capture the result
    print age !!
    */
    System.out.println("What year were you born, " + name +"?");
    int birthYear = input.nextInt();
    System.out.println("You were born in "+ birthYear+ " ?");
    int age = (2019-birthYear);
    System.out.println("That means you are "+ age+ " years old!");
/*
    ask user for height
    capture that result
    print the height !!
     */

    System.out.println("How tall are you, "+ name +  " ?");
    double height = input.nextDouble();
    System.out.println("That's a good size to be!");


    /*--------------------------------------------------------------
    //5.  When naming other scanner variables, repeat the "data type" in the "value" part:

    System.out.println("What year were you born? ");
    int birthYear = scan.nextInt();
    int age = 2019- birthYear;
    System.out.println("Wow, you are " + age + " years old!" );

    System.out.println("How tall are you? ");
    double height = scan.nextDouble();
    System.out.println("Wow, you are " + height + " feet tall!" );
    System.out.println("It's nice to meet you!" );


//??
    //String name = scan.next ();
    //String int = scan.nextInt ();
    //String double = scan.nextDouble ();
    //String  = scan.next ();
    //String name = scan.next ();
    //??
*/

}
}
