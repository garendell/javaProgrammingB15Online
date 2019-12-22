package day09_Nov19Tue;

public class b_CitizenTypeAgeChecker_ifElse {
    public static void main(String[] args) {
        /* task 2
        Create a variable with age
        if the age is more than 65, value Senior
        if not, not senior

        Print age and he she is senior
         */

        String citizenType;
        int age = 68;

        if (age >= 65){
            citizenType = "Senior";
            System.out.println("This person is "+ age + " so they are a "+ citizenType);
        }else{
            citizenType = "Not Senior";
            System.out.println("This person is "+ citizenType);
        }

    }

}
//I didn't know how to declare the String.  Here is the example.