package day15Next_Nov29Fri_Practice;

public class b_NameCheckerRepeat {
    public static void main(String[] args) {

        /*  Task 1 :  NameChecker
           declare a variable to store your name

           check whether your name length is less than 4
           if so print short name
           if it is 4-11 print medium name
           if it's more than 11, print longer name  */
     /*   String name = "Gal";
        int lengthOfName = name.length();
        if(name.length()<4){
            System.out.println("Short name");
        }else if(name.length()>=4 && name.length()<=11){
            System.out.println("Medium name");
        }else if(name.length()>11){
            System.out.println("Long name");
        }       */

/* Task2:
           check whether your name has either characters a or e
           if so print:  name has either   a   or  e
           if not:  i don't have either  a  or  e in my name
           */

            String name = "Lili";
            boolean contains = name.contains(" ");

            if(name.contains("a") || name.contains("e")){
                System.out.println("Name contains either a or e");
            }else{
                System.out.println("Name contains neither a nor e");
            }

    }
}
