package day12_Nov24Sun;

public class b_IfElseAndOrComparisons_SeasonFinder {
    public static void main(String[] args) {


          /*task2  StringEquality
        Create a class called Season finder

        create a variable called month with data type int
        write if else if else statement to do the following:

        if month is less than 1 or more than 12 -invalid month
        between 3-5 it's spring
        between 6-8  it's summer
        between 9-11 it's fall
        if month is 12,1, or 2 print it's winter*/

          //with this one I didn't remember how to use the ==
        //and of course, the curly braces, still.

     int month=2;

     if (month <1 || month >12) {
            System.out.println("I don't recognize that month.  Want to try again?");
     }else if (month >=3 && month <= 5) {
            System.out.println("It's spring!");}
     else if (month >=6 && month <= 8 )  {
            System.out.println("It's summer!");}
     else if (month >=9 && month <= 11 )  {
             System.out.println("It's fall!");
        }else if (month ==12 ||month ==1 || month ==2) System.out.println("It's winter!");

    }
}
