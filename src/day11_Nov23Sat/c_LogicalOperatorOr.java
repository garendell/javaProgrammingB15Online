package day11_Nov23Sat;

public class c_LogicalOperatorOr {
    public static void main(String[] args) {

       /*
        the OR operator:

        2 pipes || or 1 pipe | is used for compiling 2 conditions  Logical OR operator
        When will this be true?  As long as one part is true, the whole thing is true.
                          true    false ---->  statement is
        int x = 70    x > 10  ||  x<5              true
                         false     false
        int = 7;      x >10   ||  x<5               false
                    false       true
        int = -8    x > 10   ||  x < 5          true
        as long as one side is true, the resulting statement is true.  */

        System.out.println("Truth Table for && ");
        System.out.println(" result of true || true is:    "+ (true || true));
        System.out.println(" result of false || true is:   "+ (false || true));
        System.out.println(" result of true || false is:   "+ (true || false));
        System.out.println(" result of false || false is:  "+ (false || false));




    }

}
