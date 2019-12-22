package day16_Nov30Sat;

public class c_SecondWordGet {
    public static void main(String[] args) {


        //given a sentence with 3 words
        //get the second word
        //getting location of space --> indexOf
        //getting string inside another string, by beginning and ending index -->  substring

//his explanations are driving me crazy and he does move too fast. too many words,
// not enough time to do it.



//                         012345678901
        String sentence = "I Love Java";
        String secondWord;
        int firstSpaceIndex = sentence.indexOf(" ");
        System.out.println("firstSpaceIndex = " + firstSpaceIndex);

        int lastSpaceIndex = sentence.lastIndexOf("");
        System.out.println("lastSpaceIndex = " + lastSpaceIndex);

       // System.out.println((   sentence.substring(1+1,6)    );

    }
}
