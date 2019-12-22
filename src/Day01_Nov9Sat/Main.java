package Day01_Nov9Sat;

public class Main {

    public static void main(String[] args) {
	// this is actually Day 03.  I haven't figured out how to change the package name
        //the lecture notes from Day01 are in slack channel codenote
       byte letterCount = 26;
        System.out.println ("There are " + letterCount +" " + "letters in the English alphabet.");
       short sheepCount = 159;
        System.out.println ("He has " + sheepCount + " sheep on his farm");
        int catCount = 95;
        System.out.println("The Batch 15 students have a total of about " + catCount + " cats.");
        long mileToSun = 1000000L;
        System.out.println("The distance to the sun is about " + mileToSun + " miles.");
        float priceOfBanana = 1.99f;
        float priceOfPotato = 2.49f;
        System.out.println("Today the bananas cost " + priceOfBanana + " and the potatoes cost " + priceOfPotato +".");
        //the f is necessary because it's fractional and else would assume it's a double

        double priceOfiPad = 355.99d;
        double priceOfiPadOri = 1024.99d;
        //compiler assumes this is a double because it's a fractional number, but good practice to use the d anyway.
        double priceOfMac = 2299.99 ;

        //if you have a whole number by itself, compiler automatically assumes it is an int
        //if you have a fractional number by itself, compiler automatically assumes it is a double

        boolean means = true;

        char dollars = '$';
        System.out.println("Today the bananas cost " + '$' + priceOfBanana + " and the potatoes cost " +'$' + priceOfPotato +".");

        // Day04 start of class - I added package name day 04!! but I still don't know yet how to add a class.


    }



}
