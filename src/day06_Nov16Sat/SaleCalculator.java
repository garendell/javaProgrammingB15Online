package day06_Nov16Sat;

import java.util.Scanner;

public class SaleCalculator {
    public static void main(String[] args) {
        //create a program to calculate the final discounted price of an item
        //create 3 variables called regular price, sale price, and discountPercentage
        //ask user question using scanner, reg price and discount
        //save result into variable (double)
        //calculate sale price using above info
        //example:  80 reg price, .20 for discount, = sale price
        // print  reg price 80$ and discount 0.20 and final price 64$

        Scanner blabla = new Scanner(System.in);

        System.out.println("How much is the regular price?");
        double regPrice = blabla.nextDouble();

        System.out.println("How much is the discount?");
       double discount = blabla.nextDouble ();
        double salePrice= regPrice- (regPrice *discount);

        System.out.println("The sale price is "+ salePrice);

    //another way to declare variables if they are the same data type,
    //you can put them in one line
        //example:  double discount, regPrice, salePrice;



    }
}
