package repl;
import java.util.Scanner;
public class c_Repls22_23ShoppingList_PhoneNum {
    public static void main(String[] args) {
        /*
        /repl 22
        In this assignment you will write a program to create a shopping list and prices.
You will use Scanner object and ask user to enter 3 items followed by their price and you will
calculate total price and show as a report.
-Declare 4 String variables item1, item2, item3, report.
-Declare double variables price1, price2, price3, totalPrice
-Create a Scanner object named scan.

Execution flow with example:
-Display prompt "Enter Item1 and its price:"
Tomatoes  5.5
-Display prompt "Enter Item2 and its price:"
Cheese  3.5
-Display prompt "Enter Item3 and its price:"
Apples  6.3
-calculate totalPrice for all items
-build the report variable by concatenating Strings and double values:
"Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3"
"Total price: 15.3"
- Print the value of report variable */
/*
        String item1, item2, item3, report;
        Double price1, price2, price3, totalPrice;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Item1 and its price:");
        item1 = scan.next();
        price1 = scan.nextDouble();
        System.out.println("Enter Item2 and its price:");
        item2 = scan.next();
        price2 = scan.nextDouble();
        System.out.println("Enter Item3 and its price:");
        item3 = scan.next();
        price3 = scan.nextDouble();
        totalPrice=(price1+price2+price3);
        report = ("Item1: "+item1+ " Price: "+price1+ " Item2: "+ item2+ " Price: "+price2+ " Item3: " +item3+ " Price: " +price3);
        System.out.println(report);
        System.out.println("Total price: "+ totalPrice);
              */

/*  repl 23
Write a program that asks user to input int values: areaCode and localNumber.
-Using concatenation put together in this format and assign to String phoneNumber  variable:
-(222)-3334444
-Write a print statement that displays (use phoneNumber variable ):
Calling number (222)-3334444
 */

Scanner input = new Scanner(System.in);
        System.out.println("Please enter your area code: ");
int areaCode = input.nextInt();
        System.out.println("Please enter your local number: ");
int localNumber = input.nextInt();
String phoneNumber = "(" +areaCode + ")"  + "-"+localNumber;
        System.out.println( "Calling number " + phoneNumber);


    }
}
