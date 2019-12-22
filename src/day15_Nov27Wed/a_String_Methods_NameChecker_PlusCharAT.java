package day15_Nov27Wed;
import java.util.Scanner;
public class a_String_Methods_NameChecker_PlusCharAT {
    public static void main(String[] args) {

        /* Java comes with several pre-set methods to use with Strings, such as
                str.length()        length of the string
                str.toLowerCase()   convert to lowercase
                str.toUpperCase()
                str.charAt(i)       what is at character i?
                str.contains(..)   string contains a specific other string?
                str.startsWith(..)      some prefix?
                str.indexOf(..)         what is the position of a character

                 others mentioned include:
                is empty
                replace
                substring
                concat

           Task 1 :  NameChecker
           declare a variable to store your name

           check whether your name length is less than 4
           if so print short name
           if it is 4-11 print medium name
           if it's more than 11, print longer name

         /*Task 1 :
------------------------------
         */
 /*This is the way he sent the code on Canvas (WITH SCANNER):
        Scanner scan = new Scanner(System.in);

        String name = scan.next();
        int lengthOfName = name.length();  //i don't understand why we do this step.

        System.out.println("Name length =" +lengthOfName);

        if (lengthOfName < 4) {
            System.out.println("You have a short name.");
        }else if(name.length() ==4 && <= 11){
            System.out.println("You have a medium-length name.");
        }else (name.length() > 11){
            System.out.println("You have a long name.");

  *//* MY CODE - ( NO SCANNER) :
        String name = "shah";
        int lengthOfName = name.length();
        if(name.length() <4){
            System.out.println("You have a short name.");
        }else if(name.length() >=4 && name.length() <11){
            System.out.println("You have a medium name.");
        }else if (name.length()>=11){
            System.out.println("You have a long name.");
        }
        */   //NOTE:it's not necessary to say >=4.


/* Task2:

           check whether your name has either characters a or e

           if so print:  name has either   a   or  e
           if not:  i don't have either  a  or  e in my name
 */

          /*  String name = "Lili";
            boolean contains = name.contains("");
            if(name.contains("a") || name.contains("e")){
                System.out.println("Name has either a or e");
            }else{
                System.out.println("Name has neither a nor e");
            }     */

         /* Task3 Optional:   print your name in reverse order   */

        String name = "Gala";
       // name.charAt()  I'm stuck about charAt

    }
}