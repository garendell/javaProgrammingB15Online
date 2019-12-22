package day07_Nov17Sun;
import java.util.Scanner;
public class EmailBuilder  {
    public static void main(String[] args) {

        //create 3 string variable for first name, last name, company
        //create another variable for email
        //create email in this format firstName_lastName@company.com

        //print out the result as, my name is <yourfullname> and
        //I work for <company> and my email is <email>

        String firstName, lastName, company, email;
        firstName = "Gala";
        lastName = "Arendell";
        company = "cybertek";
        email = firstName + "_"+ lastName + "@"+ company +".com";

        System.out.println("My name is "+ firstName +" "+ lastName+ ", I work for " +company + " and my email is " +email );
        System.out.println("Now do it with a scanner:");
        System.out.println("Please enter your first name, last name, and the company you work for, and I will generate an email address for you:");
        Scanner scan = new Scanner(System.in); // REMEMBER THIS***
        String firstName2, lastName2, company2, email2;
        firstName2 = scan.next();
        lastName2 = scan.next();
        company2 = scan.next();
        email2 = firstName2 + "_"+ lastName2 + "@"+ company2 +".com";
        System.out.println("Your new email is " +email );


    }
}
