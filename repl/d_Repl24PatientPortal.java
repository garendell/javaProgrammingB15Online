package repl;

import java.util.Scanner;

public class d_Repl24PatientPortal {
    public static void main(String[] args) {
        //I finally made this work!  the main problem was using next instead of
        //nextLine - but I don't understand why.  Also, I had declared some variables unnecessarily, don't always understand
        // where to do that.ex: Fullname, address, and contacts, i declared outside of the print line command.)
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        System.out.println("Enter your first name");
        String firstName = scan.nextLine();
        System.out.println("Enter your last name");
        String lastName = scan.nextLine();
        System.out.println("Enter your email");
        String email = scan.nextLine();
        System.out.println("Enter your street");
        String street = scan.nextLine();
        System.out.println("Enter your city");
        String city = scan.nextLine();
        System.out.println("Enter your state");
        String state = scan.nextLine();
        System.out.println("Enter your zip code");
        int zipcode = scan.nextInt();
        System.out.println("Enter your work phone number");
        long workPhoneNumber = scan.nextLong();
        System.out.println("Enter your personal phone number");
        long personalPhoneNumber = scan.nextLong();
        System.out.println("Enter your age");
        int age = scan.nextInt();
        System.out.println("Enter your height");
        double height = scan.nextDouble();
        System.out.println("Enter your weight");
        double weight = scan.nextDouble();
        System.out.println("Are you married?");
        boolean isMarried = scan.nextBoolean();
        System.out.println("Patient personal information");
        System.out.println("Full name: " + lastName + ", " + firstName);
        System.out.println("Address: " + street + ", " + city + ", " + state + " " + zipcode);
        System.out.println("Contacts: work phone number - " + workPhoneNumber + ", personal phone number - " + personalPhoneNumber + ", " + "email: " + email);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight+ " pounds");
        System.out.println("Married?: " + isMarried);

//-----------------------------------
        //copied code from ReplChat - she used nextLine for all, I used next.
        /*Aysegul Ege  38 minutes ago
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        System.out.println("Enter your first name");
        String firstName = scan.nextLine();
        System.out.println("Enter your last name");
        String lastName = scan.nextLine();
        System.out.println("Enter your email");
        String email = scan.nextLine();
        System.out.println("Enter your street");
        String street = scan.nextLine();
        System.out.println("Enter your city");
        String city = scan.nextLine();
        System.out.println("Enter your state");
        String state = scan.nextLine();
        System.out.println("Enter your zip code");
        int zipcode=scan.nextInt();
        System.out.println("Enter your work phone number");
        long phoneNumber = scan.nextLong();
        System.out.println("Enter your personal phone number");
        long personalPhoneNumber= scan.nextLong();
        System.out.println("Enter your age");
        int age=scan.nextInt();
        System.out.println("Enter your height");
        double height = scan.nextDouble();
        System.out.println("Enter your weight");
        double weight = scan.nextDouble();
        System.out.println("Are you married?");
        boolean isMarried= scan.nextBoolean();
        System.out.println("Patient personal information");
        System.out.println("Full name: "+lastName +", " +firstName);
        System.out.println("Address: "+street+", " +city+", " +state+ " " +zipcode);
        System.out.println("Contacts: work phone number - " +phoneNumber+", personal phone number - "
                +personalPhoneNumber+ ", email: " +email);
        System.out.println("Age: " +age);
        System.out.println("Height: " +height);
        System.out.println("Weight: " +weight+" pounds");
        System.out.println("Married?: "+isMarried);*/


    }
}
