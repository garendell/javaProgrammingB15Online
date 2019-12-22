package day07_Nov17Sun;

public class amSundayNov17_reviewCoumpoundOperators {
    public static void main(String[] args) {

        //Compound operators are a shorthand way to indicate math operations
        int score = 10;
        score = score +4;
        //+=, -=, *=, %=  (with No Space between)
        score +=4; //14
        score *=3; //42
        //score /=2; //21
        score %=5; // 1

        // shorthand operators for increment and decrement  apply similarly,
        // but only when you need to add or subtract by value of 1.
        int offer = 2;
        offer +=1; //= 3 : this is one way to do it; shown here as intermediate step, just to clarify the following:
        ++offer;  //= 4  : this result means adding one to the previous 3.

        //Increment and decrement

        int apple = 10;
        System.out.println("original apple is "+ apple);
                //apple = apple +1;
                   //     apple +=1;

        ++ apple;  //add one.
        System.out.println("if I say ++apple above, and then again here, then I get "+ (++apple)); //this adds another one

        //--apple;
        System.out.println("if I say --apple, after ++apple, then the apple is "+ (--apple)+ " again.");

    }
}