package day14_Nov26Tue;

public class a_StringMethods_PasswordChecker {
    public static void main(String[] args) {
        /*  3 questions to ask about methods
        what does it do?
        do I need to proide extra data to take this action?
        what do I get out of it
So far we have looked at:
        .equals
        .Ignore case
        .UpperCase
        .LowerCase
        etc.

Anatomy of a string:  character counts start with 0 zero
char index  01234
String      hello
Char count  12345
         */
/*
        String str = "I like pumpkin";
        System.out.println("str = " + str);"str";
        */

//Password validator
        //min 8 car max 16
        // must contain underscore or $
        //must not contain contain space
        //must start with AB

        //if any of above conditions does not match say INVALID PASSWORD
        //else say good password
        String password = "AbH2723gfgdsu";

        //first one is range checking :  and it's true
        boolean min8Max16 = password.length() >=8 && password.length()<=16;

        //second one asks if it contains these things:  and it's false
        boolean mustContain_or$ =  password.contains("_") || password.contains("$");

        //Third must NOT contain space:  and it's true
        boolean mustNotContainSpace =! password.contains (" ");

        //fourth must start with Ab:  is true
       boolean mustStartWithAb = password.startsWith("Ab");

        //Now you need to combine them with if statements

        if( min8Max16 && mustContain_or$ && mustNotContainSpace && mustStartWithAb ) {
            System.out.println("Valid Password");
        }else{
            System.out.println("Invalid Password.  Please try again.");

        }

        }

    }
