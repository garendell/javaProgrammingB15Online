package day11_Nov23Sat;
public class b_LogicalOperatorsAnd {
    public static void main(String[] args) {
        /*
 the   AND  operator
        int x = 70
        in math:  60 < x < 100
        in java  x > 60 && <100 = true
 AND is indicated by &&
        int x = 70:  x > 60 (true)         &&    x < 100 (true)       true
        int x = 10;  x > 60 (false)        &&    x < 100 (true)       false
        int x = 110; x > 60                && x < 100
        int x = 99; x > 60                 && x < 100

         */
        System.out.println("Truth Table for && ");
        System.out.println(" Result of true && true is:     "+ (true  &&  true)   );
        System.out.println(" Result of false && true is:    "+ (false  &&  true)   );
        System.out.println(" Result of true && false is:    "+ (true  &&  false)   );
        System.out.println(" Result of false && false is:   "+ (true  &&  true)   );



    }
}
