package day06_Nov16Sat;

public class UsingTheValueOfOtherVariables {
    public static void main(String[] args) {


        int myFavoriteNumber = 300;
        int yourFavoriteNumber = myFavoriteNumber;
        System.out.println("my favorite number " + myFavoriteNumber);
        System.out.println("your favorite number " + yourFavoriteNumber);

        yourFavoriteNumber = 100;    //this one wins... why?  I didn't hear him./
        System.out.println("my favorite number " + myFavoriteNumber);
        System.out.println("your favorite number " + yourFavoriteNumber);

        //Create a variable called yourOrder.  type String and assign a value
        // optionally assign this value using Scanner
        //Create another variable called myOrder and assign the value
        //to same value as yourOrder by copying
        //and just print them out.

        //String yourOrder = yy;
        //String myOrder = xx;
        //here I took a nap.........................break time til 3:45



    }
}
