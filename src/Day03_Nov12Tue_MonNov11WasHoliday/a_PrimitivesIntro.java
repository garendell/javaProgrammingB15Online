package Day03_Nov12Tue_MonNov11WasHoliday;

public class a_PrimitivesIntro {
 public static void main(String[] args) {

        //There are 8 primitive data types:  boolean, character, byte, long, int, long, float, double.
        // A mnemonic for remembering this is:  be careful, bears like ingesting large fluffy dogs.

        System.out.println("This is Primitives Practice from Day 03.");
        byte letterCount = 26;
        short sheepCount = 300;
        int catCount = 20 ;
        long mileToMoon = 5000000l;
        //or
        long mileToSun  = 100000000L;

        //--------------floating point ---------
        // you must add f at the end of fractional or decimal number to indicate this is float data type
        // uppercase lowercase does not matter , but f is necessary to distinguish a float from a double
        float priceOfBanana = 1.99f;
        float priceOfPotato = 2.49F;

        //-----------  larger floating point numbers -------
        double priceOfIpad1     = 355.99d ;
        double priceOfIpadPro   = 1024.99D ;
        // compiler automatically assumes a fractional or decimal number is a double if not indicted as a float;
     // so it's not necessary to indicate a d ;  However for good programming habit , add them always.
        double priceOfMac       = 2299.99 ;
        // If you have a whole number by itself , compiler automatically assume it's an int
        // If you have a fractional number by itself , compiler automatically assume it's an double
    }
}
