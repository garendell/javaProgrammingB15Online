package day18_Dec2Mon;
import java.util.Scanner;
public class c_WhileLpRevWithScanner_GimmeFive {
    public static void main(String[] args) {

        //Keep asking for 5$ or 20$ until you get one of them.
        Scanner scan = new Scanner(System.in);

        System.out.println("Gimme Five!");
        int dollars = scan.nextInt();

        while (dollars != 5 || dollars != 20) {
            System.out.println("No thanks.  Gimme 5!");
            dollars = scan.nextInt();
        }
            System.out.println("Thank you! That's either a five of a twenty!");



    }
}
