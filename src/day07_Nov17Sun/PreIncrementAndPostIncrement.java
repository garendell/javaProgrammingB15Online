package day07_Nov17Sun;

public class PreIncrementAndPostIncrement {
    public static void main(String[] args) {

        /*
        Increment and decrement operator ++ --  has two version
                Pre-increment ++score
                post-increment   score++
                          and
                Pre-decrement  --score
                Post-decrement   score--
        */
        int apple = 8;
        System.out.println("Original apple is " + apple );
        System.out.println( "The ++apple is then " + ++apple);
        System.out.println( "If you put it this way, apple++ , it is still " + apple++);
        System.out.println("Until it shows up later in the code, then it adds 1, like now: " + apple++);
        System.out.println( apple++);
        System.out.println(apple);

        //Using the ++ or -- AFTER the value will cause it to be added or subtracted NEXT TIME
        //it shows up in the code.  It's better to just "do it now" unless necessary.

    int score = 50;
        System.out.println(++score);
        System.out.println(score++);
        System.out.println( score );
        System.out.println(--score );
        System.out.println(score-- );
        System.out.println(score);

        //it looks like this when you run it:
        //51
        //51
        //52
        //51
        //51
        //50



    }
}
