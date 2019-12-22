package day06_Nov16Sat;

public class PreIncrementDecrementOperator {

    public static void main(String[] args) {

        int offerCount = 2;

        // initializing (giving value) to a variable when we are adding or subtracting 1
        //for ex: starting with 2 offers, getting one more, you can state this
        //any of these ways (this is only for adding 1)

        //basic way;
         offerCount = offerCount +1;

        //this is a shorthand/compound operator
            offerCount+=1;

        //this one is even shorter   can be done with ++ or -- (only for +1 or -1)
        ++ offerCount;

        //these shortcuts are very useful because increasing or decreasing by one is
        //a very common situation in coding

        System.out.println("Offers after increase " + offerCount);

        -- offerCount;
        System.out.println ("Offers after decrease " + offerCount );



    }


}
