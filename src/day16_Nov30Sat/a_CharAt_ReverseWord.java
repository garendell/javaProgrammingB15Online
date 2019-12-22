package day16_Nov30Sat;

import javax.print.attribute.standard.OrientationRequested;

public class a_CharAt_ReverseWord {
    public static void main(String[] args) {

        /*   Task 1:
        Given a word with 4 characters stored in a String variable Word1
        create a String variable called word2
        store the reversed word1 into word2
        and print out
        ex:  word1 --> Java         word2 --> avaJ
        optionally:  use scanner
        NOTE:  I don't know how to do this.  I think it's a charAt, which is the part of
        the last class I did not listen to, and the place I got stuck in my practice.
        He's allowing MUCH more time today!!  yay~!  so im just waiting for the answer:
        here's an early horse from Alesya:

        String word1 = "java";
        String word2 = (word1.charAt(3)+" "+word1.charAt(2)+" "+ word1.charAt(1)+ " "+ word1.charAt(0)+ " ");
        System.out.println(word2);
        NOTE2:  ok, i get it.  We use the index location of each letter, word1 with dot charAt, and we have to put "" in
        between each one to indicate that it's concatenation of characters, not adding a numeric value (or ASCII).
        */

        String word1 = "Java";
        String word2 = (word1.charAt(3)+""+ word1.charAt(2)+""+word1.charAt(1)+""+word1.charAt(0)+"");
        System.out.println(word2);

        //OR you could:

        String wordOther1 = "Java";
        String wordOther2 = "";       //Akbar did it this way, but I don't know why - now he's explaining empty string
        System.out.println(word1.charAt(3)+""+ word1.charAt(2)+""+word1.charAt(1)+""+word1.charAt(0)+"");

        //OR  word = "" +word
        // another option is word2=word2+word1charAr(3)+...
        //shortest option is word2 += word1charAt

        // empty string or no value or I don't understand this.

        //HERE'S AN EXPLANATION:

    String msg = "Hello ";
        // msg = msg + "World!";  you can make this shorter by using += (not =+)
        msg += "World!";


//==++ here's the code note version:
        // in order to reverse a word , we need to take last character and put in first character
        // then put the second character at 1 location before first character
        // start getting character from last location till first location then save it
        //word2 =  "" + word1.charAt(3) + word1.charAt(2) + word1.charAt(1) + word1.charAt(0) ;
        //word2  = word2 +  word1.charAt(3) + word1.charAt(2) + word1.charAt(1) + word1.charAt(0) ;

        //word2  +=  word1.charAt(3) + word1.charAt(2) + word1.charAt(1) + word1.charAt(0) ;
        //System.out.println("word2 = " + word2);

    }
}
