package day06_Nov16Sat;

public class Remainder {

    public static void main(String[] args) {
        System.out.println(5/2);
        //if we don't specify otherwise, java reads this as integers,  =2

        System.out.println( 5.0 /2);
        // the larger type wins, so now java reads this as a double  = s.5

        System.out.println( 5.0/2f );
        // the larger type wins, so now java reads this as a float = 2.5 also

        //2*2 +1 = 5
        System.out.println( 5 % 2);

        //10*9 +9 = 99
        System.out.println( 99 % 10 );

        System.out.println( 100 %10);

        //this % is another arithmetic operator called modulus or remainder
        // it will give you the number remaining after whole number division

        //declare a variable called minutes data type int
        //ask user to enter minutes as whole number
        //print the result in x hours y minutes format
        //example 135 mins = 2 hours 15 mins

        int minutes = 135;

       // System.out.println("135 minutes is (135 % 60)  + x "hours"  + y " minutes";

    }
}
