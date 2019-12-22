package day10_Nov20Wed;

public class a_Answer_IfElseFizzNumber {
    public static void main(String[] args) {

          /*/create a class called Answer with main
        Create a variable called myAnswer String
        assign with value of empty string.
        Creat a variable called myNumber and assign any vlaue

        if the number can be divided by 5 without remainder, assign myAnswer value to Fizz Number.
        If not, then it's not a Fizz Number
        Outside if else statement:  print my number is []  and it is [

           */
     String myAnswer = "";  //emptyString
        int myNumber=9;

     if (myNumber %5 == 0) {
       myAnswer = "Fizz Number.";

     }else{
         myAnswer = "Not a Fizz Number.";
         System.out.println("My number is " + myNumber+ " and it is "+ myAnswer );


     }

/*  another possible answer, with scanner, Copied from Gizem:
import java.util.Scanner;
 public class Answer {
    public static void main(String[] args) {

        String myAnswer = "";
        int myNumber = 5;
        if(myNumber%5 ==0){
            myAnswer = "Fizz Number";
        }else{
            myAnswer = "Not a Fizz Number ";
        }
        System.out.println("My number is " +myNumber+ ", it is " +myAnswer);
*/

    }
}
