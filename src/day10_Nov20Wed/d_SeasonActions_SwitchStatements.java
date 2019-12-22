package day10_Nov20Wed;

public class d_SeasonActions_SwitchStatements {

    public static void main(String[] args) {
        /* REMINDER: Switch statements can only be used with NO SCANNER, with 5 of the data types, and ONLY for equality (not ranges);
        Otherwise you need to use if/else statements.

        What do you do in each season?
        Spring - hike, garden,
        Summer - get new job, hike in mountains;
        Fall - hike, birthdays, Thanksgiving
        Winter - Christmas, snow, New Year,
         */
        String season = "Fall";
        switch (season) {
            case "Spring":
                System.out.println("It's Spring. Plant some things!");
                break;
            case "Summer":
                System.out.println("It's Summer.  Take a road trip!");
                break;
            case "Fall":
                System.out.println("It's Fall.  Get ready for hiking!");
                break;
            case "Winter":
                System.out.println("It's Winter.  Get your warm clothes ready!");
            default:
                System.out.println("What season is that?  Try again.");

        }
    }}
