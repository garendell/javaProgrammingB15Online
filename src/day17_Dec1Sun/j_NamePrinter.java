package day17_Dec1Sun;

public class j_NamePrinter {
    public static void main(String[] args) {


        String name = " Call 1-800-Alexander";

        // print name vertically, without knowing the length of name
       //get each char and print them vertically

        int x = 0;

        while(x< name.length() ){
        System.out.println(name.charAt(x));
        ++x;
        }
                    //I was able to do this on my own -- EXCEPT (AGAIN) the details of punctuation.
                    //the important thing here is HOW TO GET THE LAST INDEX.  The last index of a string is x<string.length or
                    // x= string.length() -1  HOWEVER, I can't figure out how to make the debug work, to see each iteration.can i

    }
}
