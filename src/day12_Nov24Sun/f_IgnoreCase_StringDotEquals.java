package day12_Nov24Sun;

public class f_IgnoreCase_StringDotEquals {

    public static void main(String[] args) {

        /*String userName = "abc123";

        boolean userNameCorrect = userName.equals("ABC123");
        System.out.println(userNameCorrect);

        boolean nameCheckIgnoreCase = userName.equalsIgnoreCase("ABC123");
        System.out.println( nameCheckIgnoreCase );
*/

        //store your name in a name variable; check for equality using different cases

        String name = "Gala";

        boolean exactMatch = name.equals("GALA");
        System.out.println( exactMatch);

        boolean matchIgnoreCase = name.equalsIgnoreCase("gaLa");
        System.out.println( matchIgnoreCase);


    }

}