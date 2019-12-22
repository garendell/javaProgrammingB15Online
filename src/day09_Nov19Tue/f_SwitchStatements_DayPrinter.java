package day09_Nov19Tue;

public class f_SwitchStatements_DayPrinter {
    public static void main(String[]args){
    /*what we did yesterday was checking for equality within a RANGE
    today we have been checking for equality between NUMBERS
    next we will see checking for equality of CHARACTERS
    and other data types, using Switch Statements
    switch CAN ONLY CHECK FOR EXACT VALUE, NOT RANGES
    this is the difference between switch and if/else
    SWITCH is specialized.
     */

    int dayCode = 3;
    switch (dayCode) {
        case 1:
            System.out.println("Day is Monday.");
            break;
        case 2:
            System.out.println("Day is Tuesday.");
            break;
        case 3:
            System.out.println("Day is Wednesday.");
            break;
        case 4:
            System.out.println("Day is Thursday.");
            break;
    }

    //Next do this same thing with the Language picker.

    }

        }