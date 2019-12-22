package day08_Nov18Mon;
import java.util.Scanner;
public class IfStatements_WarmUp {
    public static void main(String[] args) {

        /* Create a voting eligibility program check
        minimum voting age = 18
         create a variable called age int
        if yes, print : you are ready to vote
        if less than 18, print: wait until you are 18'
*/
        int age;
        age = 19;
        System.out.println(age);
        if (age >= 18) {
            System.out.println("You are ready to vote!");

        } else{
            System.out.println("Wait until you are 18.");
        }


        /* Create a program to guess your favorite number
        create var called myFavoriteNumber as int
        ask user to guess your favorite number
        if user guessed right, print BINGO!
        if not, print try again later
         */

        Scanner scan = new Scanner (System.in);
                System.out.println("What is my favorite number?");
                int myFavoriteNumber = scan.nextInt();
        myFavoriteNumber = 9;
        if (myFavoriteNumber ==9){
                System.out.println("BINGO!  You win!");
            }else{
                System.out.println("Nope.  Try again later!");
            }

        int date = 24
                ;
        if (date <=25){
            System.out.println("Don't open presents yet!");
        }else{
            System.out.println("It's Christmas!");

        }

    }
}
