package day18_Dec2Mon;

public class a_B4ClsPract_DoWhile_While_cookies_monkeys {
    public static void main(String[] args) {

        //buying apples before you get to zero -- I invented this, from the eat an apple example in the video.

//        int appleCount = 10;
//
//        do {
//            System.out.println(appleCount + " apples left.  Have another one.");
//            appleCount--;
//        } while (appleCount > 1);
//        System.out.println("Only 1 left - buy more apples!");

        //__________________________________________________
        // While loop -- wash the dish after all the cookies are gone. kept getting infinite loop on this one.

        int cookieCount = 12;
        while(cookieCount > 0){
            System.out.println(cookieCount + " cookies left.  Have another one.");
           cookieCount--;
       }
        System.out.println("Cookies all gone!  Time to wash the dish.");

        //5 little monkeys jumping on the bed, one fell off and bumped its head
        //mama called the doctor and the doctor said, "No more monkeys jumping on the bed!"

        int numMonkeys = 5;
        while(numMonkeys>=1){
            System.out.println(numMonkeys + " little monkeys jumping on the bed, one fell off and bumped its head\n" +
                    "mama called the doctor and the doctor said, \"No more monkeys jumping on the bed!\" ");
            numMonkeys--;
            System.out.println();
        }


}
}
