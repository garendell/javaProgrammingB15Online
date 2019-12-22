package day14_Nov26Tue;

public class b_EmailChecker_StringContains {
    public static void main(String[] args) {

        /*example from previous task:
        String password = "AbH2723gfgdsu";
        boolean mustStartWithAb = password.startsWith("Ab");
        //Now you need to combine them with if statements
        if( min8Max16 && mustContain_or$ && mustNotContainSpace && mustStartWithAb ) {
            System.out.println("Valid Password");
        }else{
            System.out.println("Invalid Password.  Please try again.");*/



        /*  create a variable called email
        check for below conditions

        if it does not contain character  @  say invalid email
        if it contains space say invalid email

        if it endsWith @gmail.con -- print google email
        if it endsWith @yahoo.com -- print yahoo email
        if it endsWith @mail.ru  --  print russian email
         */

        String email = "garendell@yahoo.com";
        if (!email.contains("@") || email.contains(" ")) {
            System.out.println("Invalid email");
        } else if (email.endsWith("gmail.com)")) {
            System.out.println("Google mail");
        } else if (email.endsWith("gmail.com)")) {
            System.out.println("Yahoo mail");
        } else if (email.endsWith("mail.ru)")) {
            System.out.println("Russian mail");
        }
    }
}
