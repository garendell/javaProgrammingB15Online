package day06_Nov16Sat;

public class CompoundOperator3Remainder {

    public static void main(String[] args) {


        int bankBalance = 1140;
        System.out.println("I have spent half of my bank balance : " + bankBalance);

        //bankBalance = bankBalance/2;
        bankBalance /=2;
        System.out.println("Now my balance is : " + bankBalance);

        //now i want to divide the balance by 500 and keep the remainder in my pocket
        bankBalance %= 500;
        System.out.println("I want to divide the balance by 500 and keep the remainder in my pocket.");
        System.out.println("The remainder is: " + bankBalance);


        //Other task:
        // you have 2 dollars
        //2 dollars is 200 cents
        //you buy something for 74 cents
        //What's in your change? :
        //how many quarters
        //how many dimes
        //how many nickels
        //how many pennies

        int cents = 200;
        cents -= 74;

        int quarter = cents/25;
        int pennies = cents%25;
        System.out.println( quarter);
        System.out.println( pennies);

        //now i want to calculate the change in dimes

        int dimes = cents/10;
        System.out.println(dimes);
        int pennies2 = cents%10;
        System.out.println( pennies2);


    }


}
