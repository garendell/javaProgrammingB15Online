package day16_Nov30Sat;

public class b_StringTask2fromCodeNote_Google {
    public static void main(String[] args) {

        /* This is 11:22am, a little past the first break on the recording - below is copied from screen.
        PRACTICE THIS ON MY OWN!

        Task 2:
        When searching from google ,
        it will always show your search keyword in tab name
        for example if you search Java
        your tab title is : Java - Google Search

        Create a program to ask user to
        enter a String with any number of word

        Create a variable called searchKeyword to save user input

        Create another String variable called tabTitle
        assign tabTitle value to searchKeyword +  "- Google Search"

        Check if tabTitle start with your searchKeyword
        and end with - Google Search
        If so print the test has passed , if not print test has failed
                (Assume you don't know tab title is already correct
        in real world , we will capture it with automation)    */

        String keywordToSearch = "Java";
        String tabTitle = keywordToSearch + " - Google Search";

        if (tabTitle.startsWith(keywordToSearch) && tabTitle.endsWith(" - Google Search")   ){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }

    }
}
