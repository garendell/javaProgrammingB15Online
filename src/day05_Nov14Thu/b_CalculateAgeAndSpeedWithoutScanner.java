package day05_Nov14Thu;
//after this, begin naming packages starting with lowercase (day06)

public class b_CalculateAgeAndSpeedWithoutScanner {
    public static void main(String[] args) {

        //As seen before, there are 8 PRIMITIVE data types: boolean, char, byte, short, int, long, float, double.
        //how to make a block comment:
            /*
            whole numbers       :   byte,short,int,long
            fractional numbers  :   float, double
            logical             :   boolean (true,false)
            character           :   char (single character in single quotes)

            usually by default, for whole numbers, use int
            usually by default, for fractional numbers, use double

            String is NOT one of the PRIMITIVE data types.  It is a sequence
            of characters, marked by double quotes.
             */

        // task 1 Age calculator
        // given birth year, please calculate age

        int birthYear = 2001;
        int currentYear = 2019;
        int age = currentYear-birthYear;
                //I was born in 2001, so I am 18 years old
        System.out.println("I was born in " + birthYear + " so I am "+ (currentYear - birthYear)+ " years old.");
        System.out.println("I was born in " + birthYear + " so I am "+ (age)+ " years old.");

        //Task2  you are speeding today
        //Speed limit is some number and your current speed is this.
        //generate output of :  you are driving 10 mph above the speed limit

        int speedLimit = 65;
        int currentSpeed = 80;
        int overLimit = (currentSpeed - speedLimit);

        System.out.println("You were driving "+ overLimit + " mph over the speed limit.");

        //now let's do this allowing keyboard input of the year or the speed  Go to class "theScannerWay


    }


    }
