package day09_Nov19Tue;

public class c_DayPrinter {
    public static void main(String[] args) {

        /* create a variable called dayCode as int
        monday is 1
        Tues is 2
        etc.
        if none of the above, print unknown day
        The FOLLOWING example works, but it is not efficient.
         */

        int dayCode = 4;

        if (dayCode == 1) {
            System.out.println("Day is Monday");
        } else if (dayCode == 2) {
            System.out.println("Day is Tuesday");
        } else if (dayCode == 3) {
            System.out.println("Day is Wednesday");
        } else if (dayCode == 4) {
            System.out.println("Day is Thursday");
        } else if (dayCode == 5) {
            System.out.println("Day is Friday");
        } else if (dayCode == 6) {
            System.out.println("Day is Saturday");
        } else if (dayCode == 7) {
            System.out.println("Day is Sunday");
        } else if (dayCode == 8) {
            System.out.println("Day is unknown");

            //this is ok but not efficient, and there's a better way

        }
    }

}

