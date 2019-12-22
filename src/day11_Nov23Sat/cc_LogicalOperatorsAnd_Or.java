package day11_Nov23Sat;

public class cc_LogicalOperatorsAnd_Or {
    public static void main(String[] args) {

      /*create a variable called num with type int
        find out whether this number is more than 100 OR less than 10
         */
        int num = 70;
// find out if the number is within the range of 10-60 and print the result.
        System.out.println("The number is 70.");
        System.out.println("This number is more than 10 and less than 60:   " +(num >10 && num <60) );


        int num2 = 55;
// find out if the number is within the range of 10-60 and print the result.
        System.out.println("The number2 is 55.");
        System.out.println("This number is either more than 10 OR less than 10:   " +(num2 >10 || num2 <10) );
/*
you can also do more than 2 conditions at the same time.  It will go step by step
Break time.  Finish this after you take a break:
 */
        int x = 55;
        System.out.println(" true || false || false:  " + (x >100 || x <10) );
        System.out.println(" true && true && false  " + (x > 10 && x < 60 ) );

        // more than 2 conditions at the same time
        // get this later

        int y = 56;
        System.out.println((  y == 50 || y ==51 || y == 55    ));

        /*--------------------*/

        // check is z more than 50 and z is not 52 or z equal to 57  (why == instead of = I missed something here;
        // I don't see what the value of z is and ??
        int z = 57;
        System.out.println(z > 50 && z != 52 || x ==57 );

        // check the code note - 12:30 I GOT DISTRACTED!!

        /* now he said he's going to talk about combining this with IF statements; but first this:

        && double ampersand and single ampersand &  -- these are Logical AND operators
        This is used to check whether both conditions are true at the same time.

        && is called a "short circuit AND"
        it does not check the next condition as long as the first condition is false.
        example:  rocket launching
        isEngineRunning  &&   isCommunicationWorking  &&   isAirEnough
        if the first condition is false, it stops checking.

        BUT the single ampersand & continues checking each part
        the result might be the same in the end, but it will check each part.
        this information could be useful in some cases,
        but vast majority of the time we will use && and quit as soon as one part is false.

There is a way to see where the checking stopped.
example
        System.out.println(   9/0   );  can't divide by zero.  we get error.

        combine the result of checking 5 is more than 10
        and 9 divided by 0 is 3.

         [I also missed most of these notes]
         */
        System.out.println("___________________");
        System.out.println( 5>10 );

        System.out.println (  5>10 && 9/0==3 ); // this gives false

        System.out.println(  5>10  &  9/0==3 ); // this gives error message


    }
}
