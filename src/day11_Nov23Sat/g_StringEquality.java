package day11_Nov23Sat;

public class g_StringEquality {
    public static void main(String[] args) {

         //String is not a primitive data type; that's why we capitalize it.

       /* String name2 = new ;  new is the keyword, same as we use with Scanner
        we need to set up an object;  objects have state(attribute) and behavior (method);
        object behaviors slide - went too fast
        answer:  class

        what is a class
        a blueprint/template to creat an object
        Each objects are created out of the corresponding class
        for example Scanner is a class that comes with java
        we have been assigning it (an object?)
        the Scanner class that comes with java is a blueprint

        a  bird object flies, a snake object crawls, a fish object swims
        - methods associated with particular objecs

        What is a class
        Each object is created out of.....

        Whenever a class is created it can be a data type
        for example
        String has its own class like this:  String s;
        if you have a class called: public class Car {}  -->  Car c;

        Inside class
        A class defines properties and behaviors of object
        Every object created out of this template/blueprint
        will have all the properties and behaviors.
        example:  Scan.next.in

        String class (special class)  ex:  String s = "Hello world";
        It's almost like declaring a variable, name, and value
     Another way:
     String object
     *String Literal:   String s ="Hello World";

     or Using "new" keyword:
     String s = new String ("Hello World");
*/
        String name = "Rabia";
        String name2 = new String("Rabia");
        String name3 = "Rabia";

        System.out.println(name);
        System.out.println(name2);

        System.out.println(name == name2); //this shows false
        System.out.println( name == name3 ); // this shows true  This SEEMS CRAZY!
        //explanation to come.  Instructions: don't use == with strings.  use the
        //following method:

        /*
        the correct way of comparing string to get consistent result is
        using one of the String object behavior / method called
        the ".equals method":
        str1.equals(str2
         */
        System.out.println("using equals method we get: ");
        System.out.println(  name.equals( name2 )  );
        System.out.println(   name.equals (name3)  );

        /* for today:  the bottom line instruction is DON'T USE == WITH STRINGS.
        tomorrow we will discuss the reason why.
         */

    }
}