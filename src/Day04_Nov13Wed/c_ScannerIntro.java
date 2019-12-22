package Day04_Nov13Wed;

import java.util.Scanner;

public class c_ScannerIntro {
    public static void main(String[] args) {


/*  Following is the introduction to using a scanner:
                // I want to save user's input after asking some questions
                // and I want to save this input so I can do something with it

                // Step 1 :  Use "Scanner" class to create a scanner object that has this functionality

        //To start a scanner, declare it like a variable, with the data type "Scanner" , the name (whatever) , and the value...
        // the value is...   REMEMBER THIS:      new Scanner(System.in)
        //the value is:  new Scanner(System.in)
        //the value is:  new Scanner(System.in)
        //the value is: new Scanner(System.in)
        //the value for Scanner is : new Scanner(System.in)
        // The data type for a scanner is:  Scanner
        //the name for a scanner is: (whatever you name it)
        //the value for a scanner is: new Scanner(System.in)
        //the value for a scanner is:  new Scanner(System.in)
        //for example, the new scanner called "input looks like this:
        Scanner input = new Scanner(System.in);
        //-------------------------------------------------------------------
        */

        // ask user to enter their first name
        System.out.println("Please enter your first name: ");

        //now you need to set up a scanner to capture the input
        Scanner input = new Scanner(System.in);

        // then you need to import the java utility called scanner. You do this by typing import " java.util.Scanner; "
        // you do this at the top of the code, between the "package" and the "class".
        //look above, to see where to put this import statement

        // then you need to declare the variable you want the user to input.  Data type, name, then...(see next line):
        // the "value" part for input data of one word is: input.next();
        // the value part for input data of one word is:  input.next();
        //the value part for input data of one word is:  input.next();
        // for example, if you want to capture a firstName "String" data type,
        // you need to say: String firstName = input.next();

        String FirstName = input.next();
        System.out.println("Nice to meet you, " + FirstName + ".");
        System.out.println("Welcome to Oxford Cottage.");

        // input.next()   only works for a single word, no spaces.
        // after space will be ignored.
        // after the user hits enter it goes to the next input request in the code.
        // if you want to put more than one word on the same line, there's a different input value for that
        // that other input value is introduced in the next lesson:  input.nextln()




    }
}
