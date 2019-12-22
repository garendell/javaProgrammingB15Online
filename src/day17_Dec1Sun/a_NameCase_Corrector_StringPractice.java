package day17_Dec1Sun;

public class a_NameCase_Corrector_StringPractice {
    public static void main(String[] args) {

        // Task1                        I DON'T KNOW HOW TO DO THIS!!!!  AT ALL!!
        // create a string var to store your name in any case combination
        //jon   jOn   jON  any of them:

        //in plain english:
        // I need to be able to enter my name in any case and the program will
        //accept it and recognize it.




        //Task 2
        // first letter uppercase then rest lowercase
        // jon ---> Jon     arya .--> Arya

         //the logic is:  get the first character >> make it upper case
        //get the rest of the characters starting from second character
        //then make them lowercase
        //eventually concatenate them

                String name = "kHumAyRa";
                //substring method copy the part of String inside another String
        // it has 2 versions:
        // 1 starts with a certain index and ends at ending index
        //2  starts with certain index then get the rest of the string


        //one way //char has no methods, only string, //so you can do:  chaining methods
        //      String name = name.equalsIgnoreCase(); this is my first guess
        //      String nameFixed = (name.charAt(0)+"").toUpperCase();
        //      nameFixed = nameFixed + name.substring(1).toLowerCase();

                //another way
             String nameFixed = name.toUpperCase().substring(0,1);
                    nameFixed+= name.substring(1).toLowerCase();

        System.out.println("nameFixed = " +nameFixed);


        /// String name2 = .startsWith??

        //optionally use Scanner

        //Task3
        // Optionally ask your full name then make your full name
        // first letter uppercase the rest lowercase



    }
}
