package repl;
import java.util.Scanner;
public class j_Repl30AnotherWay {
    public static void main(String[] args) {

//        String item1,item2,item3,report;
//        double price1,price2,price3,totalPrice;
//        int count1,count2,count3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Item1, count and its price: ");
        String item1 = scan.next();
        int count1 = scan.nextInt();
        double price1 = scan.nextDouble();

        System.out.println("Enter Item2, count and its price: ");
        String item2 = scan.next();
        int count2 = scan.nextInt();
        double price2 = scan.nextDouble();

        System.out.println("Enter Item3, count and its price: ");
        String item3 = scan.next();
        int count3 = scan.nextInt();
        double price3 = scan.nextDouble();

        /* only if item count is more than zero  calculate total price
          The unit test assumes that item1 count is always more than 0
  The only situations you need to handle are either item2 count is 0 or item3 count is 0.
  Think simple and just handle the only item2 is 0 or  only item3 is 0 branches*/
        //System.out.println("count1=" + count1 + " count2=" + count2 + " count 3= " + count3);

        //-build the report variable by concatenating Strings and double price values:
        String report = ("Item1: " + item1 + " Price: " + (count1 * price1) + " Item2: " + item2 + " Price: " + (count2 * price2) + " Item3: " + item3 + " Price: " + (count3 + price3));
        if (count2 == 0) {
            System.out.println("Item1: " + item1 + " Price: " + (count1 * price1) + " Item3: " + item3 + " Price: " + (count3 * price3));
        } else if (count3 == 0)
            System.out.println("Item1: " + item1 + " Price: " + (count1 * price1) + " Item2: " + item2 + " Price: " + (count2 * price2));

        if (count2 == 0) {
            System.out.println("Total Price= " + ((price1 * count1) + (price3 * count3)));
        } else if (count3 == 0) {
            System.out.println("Total Price= " + ( (price1 * count1) + (price2 * count2) ) );

//        -do not include items that have count 0, use if statement !
//                -Calculate total price for the item and concatenate like below
//        "Item1: Tomatoes Price: 10.8, Item3: Apples Price: 31.5"
//        Explanation: (Item2 "Cheese" is not included since its count is 0)
//        - Print the value of report variable
//                - Print total Price:
//        "Total price: 42.3"


        }
    }
}
