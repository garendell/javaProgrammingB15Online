package repl;
import java.util.Scanner;
public class b_Repls012_021 {
    public static void main(String[] args) {
        /*do not change Repl.12
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        double cost = in.nextDouble();
                    System.out.println( num+ " "+cost );
         */
        /*Do not change repl.13
        String word = new Scanner(System.in).nextLine();
        //Write Your code here
                    System.out.println("Today's word of the day is "+ word);*/
        //do not change repl.14
/*    Scanner scan = new Scanner(System.in);
    int first = scan.nextInt();
    int second = scan.nextInt();*/
        //first and second are already declared and given values.
        //Write a single statement that will print the message "first is "
        // followed by the value of first, and
        // then a space, followed by "second = ", followed by the value of second.
        //Ex: first is 55 second = 123
        //          System.out.println("first is " + first + " second = "+ second);
        /* do not change repl015
        Given an integer variable i and a floating-point variable f,
        that have already been given values, write a statement that
        writes both of their values to console in the following format:
        i=value-of-i f=value-of-f
        Ex: Assume i = 9 and f = 33.4
        Output should be:
        i=9 f=33.4
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        float f = scan.nextFloat();
                        System.out.println("i="+ i + " f=" + f );*/
        /*repl016.  DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
       MyQuestion: what happens if I leave the Scanner util at the top, but don't use it?
       Answer - nothing.  no problem.  leave it there.
        Five friends are going to the theater. They have purchased a row of five seats with an aisle on either end.
        5 String variables are already declared to stored their names.
        James doesn't want to sit next to Jill
        Betty and Herb are dating and want to sit next to each other
        Bob wants to sit on an left side aisle
        James wants to sit on the aisle
        Provide a seating order that conforms to the above rules. An example of an invalid seating order is:
        James, Betty, Herb, Bob, Jill
        The above arrangement is invalid because: Bob is not sitting on left aisle.
                Specify the seating order as the names separated by commas and a space (as in the above example).
        Use variables and print names in the right order.
        String p1 = "James";
        String p2 = "Jill";
        String p3 = "Bob";
        String p4 = "Betty";
        String p5 = "Herb";
        //WRITE YOUR CODE BELOW THIS LINE:
                    System.out.println(p3+", "+ p2 +", " +p4+ ", "+p5+", "+p1); //correct answer requires Herb&Betty to be in this order*/
/*repl017   DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        2 String variables are already declared and assigned values.
        They will hold different programming language names.
        Using those variables print the message exactly like below.
        Ex:
        Assume lan1 = "Java" and lan2 = "SQL"
        You need to print exactly:
        I will learn "Java" and "SQL" at CybertekSchool.
 */
        /*Scanner scan = new Scanner(System.in);
        String lan1 = scan.nextLine();
        String lan2 = scan.nextLine();
        //WRITE YOUR CODE BELOW THIS LINE

        System.out.println("I will learn "  +'"'+ lan1+'"'+ " and " + '"' + lan2+'"' +" at CybertekSchool.");*/

        /*   Repl018
        Declare an integer variable named degreesCelsius
        Nothing else. Yes, its that simple!
        int degreesCelsius;   */

        /*  Repl 019    Declare an byte variable named steps and assign 100
Declare an short variable named miles and assign 5000
Declare an int variable named count and assign 1000000
Declare an long variable named population and assign 3434455667
        byte steps = 100;
       short miles = 5000;
       int count =1000000;
     long population = 3434455667L;*/



        /*  Repl 20
        In this assignment, you will write code to put together time of day.
Like this: 12:24:33 PM
1. Declare variables: hour, minute, second that can hold int values.
    Declare amOrPm variable that can hold a String ("AM" or "PM")
2. Instructor will set different values to your variables
3. Using the variables and concatenation, print values in the format mentioned above.
         */
        //1. WRITE YOUR CODE HERE:
        /*int hour, minute, second;
        String amOrPm;
        //DO NOT TOUCH BELOW LINES. TEACHER WILL SET VALUES
        Scanner sc = new Scanner(System.in);
        hour = sc.nextInt();
        minute = sc.nextInt();
        second = sc.nextInt();
        amOrPm = sc.next();

        //#############################
        //2. WRITE YOUR CODE HERE:
        System.out.println(hour + ":" + minute + ":"+ second + ":"  + amOrPm );
*/
        /*Repl 021
        In this assignment you will create a Scanner object and ask user to enter 3 number inputs.

-Declare integer variables num1, num2, num3, sum.

-Create a Scanner object named scan.

-Display prompt "Enter 3 numbers:"

-Using scanner object let user input 3 numbers

-Add 3 numbers and assign to sum variable

-Print "Sum of numbers: ValueOfSum"
         */

        int num1, num2, num3, sum;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();
        sum = ( num1+num2+num3);
        System.out.println("Sum of numbers: ValueOfSum");

    }
}