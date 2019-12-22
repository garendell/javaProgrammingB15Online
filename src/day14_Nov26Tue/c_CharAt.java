package day14_Nov26Tue;

import java.sql.SQLOutput;

public class c_CharAt {
    public static void main(String[] args) {


        //charAt method of String
        //it will return a character at a specified location
        // enter a name and show the location(index) of each character

        String aName = "Gala";
        char c1 = aName.charAt(0);
        char c2 = aName.charAt(1);
        char c3 = aName.charAt(2);
        char c4 = aName.charAt(3);

        System.out.println(""+c1+c2+c3+c4); // this is the way to print it with only one print line command
                                            // this works because we defined c1 = index 0, it prints the counts not the index
                                            // why does it work with " at the beginning?
        // bc: if you concatenate characters it will give you an ASCII number, so you need to either put " " spaces in between
        // each character OR you can just put "" at the beginning.
                                            // why does this print horizontally?
/*   */
        String name = "Kamran";
        System.out.println(name.charAt(0)); // this prints out vertically, printing each index on a line separately
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(4));
        System.out.println(name.charAt(5));
                                            //if you try to do 6 it will give an error that location doesn't exist.


        String name2 = "KamranGala";
        System.out.print(name2.charAt(0));// this prints out horizontally because or print instead of println
        System.out.print(name2.charAt(1));
        System.out.print(name2.charAt(2));
        System.out.print(name2.charAt(3));
        System.out.print(name2.charAt(4));
        System.out.print(name2.charAt(5));
        System.out.print(name2.charAt(6));
        System.out.print(name2.charAt(7));
        System.out.print(name2.charAt(8));
        System.out.print(name2.charAt(9));

        //System.out.printl(""+c1+c2+c3+c4);

    }
}
