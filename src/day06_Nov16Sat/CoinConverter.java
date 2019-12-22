package day06_Nov16Sat;

public class CoinConverter {
    public static void main(String[] args) {

        //You have 200 cents
        //how many quarters can you get?
        //how many dimes can you get?
        //how many nickels can you get?
        //how many pennies can you get

        int cents = 200;
        int quarters = (cents/25);
        System.out.println("200 cents = " + quarters+" quarters or");
        int dimes = (cents/10);
        System.out.println("200 cents = " + dimes+ " dimes or");
        int nickels = cents/5;
        System.out.println("200 cents = " + nickels+ " nickels.");
        int pennies = cents / 1;
        System.out.println("200 cents = " + pennies+ " pennies.");

        //purchase a candle for 74 cents.  how much remains?
        // ---- MY ATTEMPT - DID NOT WORK -----
//        int candle = 4;
//        int change = cents-candle;
//       System.out.println("Change after buying a 74-cent candle will be "+change+ " cents.");
//        int quartersChg = (change/25);
//        int remainder = change%25;
//        int dimesChg = remainder/10;
//        int newRemainder = (remainder-dimesChg)*10;
//        int nickelsChg = newRemainder/5;
//        int finalRemainder = newRemainder-nickelsChg;
//        int penniesChg = finalRemainder/1;
//        System.out.println("Your change is "+quartersChg+ " quarters,"+dimesChg+ " dimes, "+nickelsChg+ " nickels, "+penniesChg+ " pennies.");

        //// ---- Akbar's code does not answer the question bc he only uses quarters and pennies -----
        cents -=74;  // at this point we have change of 126

        int quarter = cents/25;  // 126/25 = 7 quarters remainder of 1
        int pennies2 = cents%25;  // this is the 1 remaining = 1 penny


        //arithmetic operators
        short b = 20;
        short sh = 10;
        int total = b/sh;
        System.out.println("total = " + total);
    }
}
