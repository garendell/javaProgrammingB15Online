package day11_Nov23Sat;

public class h_StringEqualityPractice {
    public static void main(String[] args) {
        /* checking for String equality should always be
        done using the .equals method

        ex:  oneString.equals(anotherString)   the result will be true or false
        the .equals method comes from the String class
        each and every String object you created will have this functionality

        just comparing 2 String literals  directly using equals method
        this is something that you will rarely use
        System.out.println(   "Java" .equals("java")    ) ;
         */

        String myStr = "Java" ;
        System.out.println( myStr.equals ("Java")   ) ;

        /* intellij displays the word original as a helper, it is not part of your code,
        just ignore it and keep typing.
         */
        String yourStr = new String( "Java");
        System.out.println("is my string same as your string?");
        //how to compar myStr to yourStr for equality
        System.out.println(    myStr.equals(  yourStr ));

        /* create a prog to check whehter myStr value is Java
        if true -- Correct Word!
        if false -- Say Java!
         */

        if( myStr.equals("Java")     ) {
            System.out.println("Correct word!");
        }else{
            System.out.println("Say Java!!");
        }

    /*  This part I WAS in fact paying attention, but I still don't quite get it yet.
        As always, I understand the theory, I understand why,
        but it seems like a lot of people already have some info that I don't have yet.
        this confirms that I'm a little behind.  I need to Work on this in the early tomorrow morning Sun.
        there's a short on Canvas and also a new pdf he just sent to Canvas.
     */

    /* update this prog to add more conditions
    using else if in the middle
    check the value of myStr
    if it is Java say "correct word"
    if it is Cava say  "pumpkin"
    else say not java nor pumpkin
     */

    String myStr2 = "Pie";

    if (myStr2.equals ("Java")  ) {
            System.out.println("Correct word!");
        }else if (myStr2.equals ("Cava" )  ) {
        System.out.println("Pumpkin!");
    }else{
        System.out.println("Neither Java, nor Pumpkin!");
        }

    }
}
