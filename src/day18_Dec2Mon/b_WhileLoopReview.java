package day18_Dec2Mon;

public class b_WhileLoopReview {
    public static void main(String[] args) {

//we can use a while look for checking within a range

        int x = 10;             //first, initialize the variable (where to start  counting?)
        while (x > 5) {         // then setup the condition (where to finish counting?)

            System.out.println(x + " IS MORE THAN 5");
            --x;                //it is essential to do this to end the loop
                                // it must be inside the curly braces (part of the statemtn)
        }
        System.out.println("THE END ");
    }
}

