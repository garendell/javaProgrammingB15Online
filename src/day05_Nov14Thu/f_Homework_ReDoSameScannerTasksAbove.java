
package day05_Nov14Thu;
import java.util.Scanner;

public class f_Homework_ReDoSameScannerTasksAbove {
    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);

        //Task 3 : time converter

       // System.out.println("How many days do you want to calculate?");
        //int days = scan.nextInt();
        //int minutes = (days * 60 * 24);
        //System.out.println( "There are " + minutes +" minutes in " + days + " days.");



   /* Task 4 :
    *  Create an interactive program to ask user for hourly wage
    *  and generate yearly salary
        assume that he works 2080 hour for a year.


    */
    /*
      Task 5 : Grocery Shopping
        ask user whats the price of tomato and store it
        ask user how many tomato you want to buy and store it
        ask user whats the price of potato and store it
        ask user how many potato you want to buy and store it
        ask user whats the price of banana and store it
        ask user how many banana you want to buy and store it
    */

      //generate this example output
        //You got 3 tomato price is 2.99 and total -->>
        //You got 5 potato price is 3.49 and total -->>
        //You got 2 banana price is 1.99 and total -->>
        //Your grand total for this shopping is ???

        System.out.println("Price of tomatoes? : ");
        double priceTom;
        priceTom = scan.nextInt();
        System.out.println("How many tomatoes did you get? : ");
        int tomCount;
        tomCount = scan.nextInt();
        System.out.println("Price of potatoes? : ");
        double pricePot;
        pricePot = scan.nextInt();
        System.out.println("How many potatoes did you get? : ");
        int potCount;
        potCount = scan.nextInt();
        System.out.println("Price of bananas? : ");
        double priceBan;
        priceBan = scan.nextInt();
        System.out.println("How many bananas did you get? : ");
        int banCount;
        banCount = scan.nextInt();
        System.out.println("Your total is "+ '$'+ (priceTom*tomCount) + (pricePot*potCount)+ (priceBan*banCount));




}
        }