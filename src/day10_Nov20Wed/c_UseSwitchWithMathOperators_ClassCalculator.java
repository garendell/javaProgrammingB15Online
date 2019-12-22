package day10_Nov20Wed;

import org.w3c.dom.ls.LSOutput;

public class c_UseSwitchWithMathOperators_ClassCalculator {
    public static void main(String[] args) {


/* create a class calculator
create a variable called operator with type char
Assign a value for one of these 4:  + - * /
use SWITCH statement to do the following:

if the operator is + you are about to add numbers
if the operator is - you are about to subtract numbers
if the operator is * you are about to multiply numbers
if the operator is / you are about to divide numbers
if nothing matches, print invalid operator
 */
        char operator = '-';    //we will have 4 branches plus unknown
        switch (operator) {
            case '+':
                System.out.println("You are about to add numbers.");
                break;
            case '-':
                System.out.println("You are about to subtract numbers.");
                break;
            case '*':
                System.out.println("You are about to multiply numbers.");
                break;
            case '/':
                System.out.println("You are about to divide numbers.");
                break;
            default:
                System.out.println("Unknown operation");
break;

        }

//copied from a classmate:    char operator='+';
//switch (operator){
//    case '+' :
//        System.out.println("You are about to add numbers");
//        break;
//    case '-' :
//        System.out.println("You are about to subtract numbers");
//        break;
//    case '*' :
//        System.out.println("You are about to multiple numbers");
//        break;
//    case '/' :
//        System.out.println("You are about to divide numbers");
//        break;
//    default:
//        System.out.println("This is not an operation");
//        break;


    }
}
