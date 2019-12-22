package day11_Nov23Sat;

public class i_InventMyOwnSwitchStatements {
    public static void main(String[] args) {

        //    Create a variable as String and assign one of below options
        //    You have 4 children who want to open the first present
        //    Jacob
        //    Lili
        //    Dakota
        //    Hazelnut
        //    Use switch statement to write a program to print which child gets to open the first present.
        //     */

       /* String luckyChild = "Hazelnut";
        switch(luckyChild){
            case "Jacob":
                System.out.println("The lucky child who gets to open the first present is:  " + luckyChild );
            break;
            case "Lili":
                System.out.println("The lucky child who gets to open the first present is:  " + luckyChild );
                break;
            case "Dakota":
                System.out.println("The lucky child who gets to open the first present is:  " + luckyChild );
                break;
            case "Hazelnut":
                System.out.println("The lucky child who gets to open the first present is:  " + luckyChild );
                break;
            default:
                System.out.println("Hmmm... I don't recognize that name!  Want to try again?");
                break;}
            */


            /*  Ok, let's try another one

         //    Create a variable as String and assign one of below options
        //    You have 3 choices of how to get to Telluride:
        //    Fiat
        //    FourWD
        //    Fly
        //    Use switch statement to write a program to print which shows each of the 3 options.
*/
            String transpo = "4WD";
            switch (transpo){
                case "Fiat":
                    System.out.println("You get to go to Telluride in the " + transpo);
                    break;
                case "FourWD":
                    System.out.println("You get to go to Telluride in a " + transpo);
                    break;
                case "fly":
                    System.out.println("You get to " + transpo + " to Telluride.");
                    break;
                default:
                    System.out.println("I don't recognize that mode of transport.  Want to try again?");
                    break;
            }
        }
    }

