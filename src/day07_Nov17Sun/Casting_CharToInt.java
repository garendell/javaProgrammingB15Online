package day07_Nov17Sun;

public class Casting_CharToInt {
    public static void main(String[] args) {

        //char to int conversion happens implicitly because int is a wider data type
        // and it is behind the scenes in the ASCII designations
        //ASCII code for letter a is 97, so

        //char achar = 'a';
        //int n = aChar ;

        //there was an inconsistency in the slide here;
        // we used d=100 instead of a, and didn't finish this.

        char grade = 'B';
        System.out.println("your grade is " +grade );

        int gradeInNumber = 'B';
        System.out.println("your score is "+gradeInNumber);
        System.out.println("This is an error, bc 66 is the ASCII code for the letter B, not the score for a grade of B.");


        //saving the number as char so we can get the ASCII number
        char myFirstChar = (char) 100;
        System.out.println(myFirstChar);

        //Task:  figure out the ascii code for your name.  I did not get this****
        int namG   ='G';  //& 71
        int namA = 'A';   //& 65  +65
        int namL = 'L';  //& 76


        System.out.println(namG+namA+namL+namA);






    }
}
