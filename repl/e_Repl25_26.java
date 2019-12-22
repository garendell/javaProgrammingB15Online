package repl;

        /*using an if statement check which
        int is larger a or b, and then output:
"number is greater".
for example:
a=1
b=2
output:
2 is greater
a=5
b=7
output:
7 is greater  */
        /*public class e_Repl25 {
            public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        if (a > b) {
            System.out.println(a + " is greater");
        } else {
            System.out.println(b + " is greater");
        }    _______________________________________________ */

                /*REPL26
in this assignment you are given an int num.
you need to check if num is positive negative or equals to zero.
use 3 if statements to do this .
output if num is positive negative or zero

for example:
num  = 1
print:
"positive"

num = -6
print:
"negative"

num = 0
print:
"zero"  */

import java.util.Scanner;
public class e_Repl25_26 {
   public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

                if(num >0){
                    System.out.println("positive");
                }if(num <0  ){
                    System.out.println("negative");
                }if(num==0){
           System.out.println("zero");

       }


                }
                }
