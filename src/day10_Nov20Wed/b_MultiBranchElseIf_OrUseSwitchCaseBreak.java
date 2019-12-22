package day10_Nov20Wed;

public class b_MultiBranchElseIf_OrUseSwitchCaseBreak {
    public static void main(String[] args) {

        System.out.println("Welcome to PTerrys, what would you like today?");

    /*
    11  burger
    5 fries
    8 nuggets
    35 ice cream
     */

           /* String order = "";    //we will have 5 branches plus unknown
        int itemNumber =35;

        if(itemNumber == 11) {
            System.out.println("You have selected 11.");
            order = "Burger";
        }else if( itemNumber ==5) {
            System.out.println("You have selected 5.");
            order = "fries";
        }else if(itemNumber == 8) {
            System.out.println("You have selected 8.");
            order = "nuggets";
        }else if (itemNumber == 35) {
            System.out.println("You have selected 35. Yum!");
            order = "ice cream";
        }else{
            System.out.println("Unknown item, Try Again.");
            order = "Unknown";
        }
            */

        /*  Now do this using switches
        11  burger
    5 fries
    8 nuggets
    35 ice cream
     */
        String order = "";    //we will have 5 branches plus unknown
        int itemNumber = 5;  //you can use byte, short, int, char, String NOTNOTnot: float,double,long,char

        switch (itemNumber) {
            case 11:
                System.out.println("You have selected 11");
                order = "Burger";
                break;
            case 5:
                System.out.println("You have selected 5.");
                order = "fries";
                break;
            case 8:
                System.out.println("You have selected 8.");
                order = "nuggets";
                break;
            case 35:
                System.out.println("You have selected 35. Yum!");
                order = "ice cream";
                break;
            default:
                System.out.println("Unknown item, Try Again.");
                order = "Unknown";
                break;
        }
        System.out.println("Your order is "+ order +".");

                /*
                What do you do to get ready for class:
                1 find out the topic (Canvas)
                2 practice previous topic
                3 repl
                4 prepare questions for ofc hr or class
                5 watch the short (Canvas)
                6 read the book
                7 join ofc hr
                8 check in on slack
                9 help others with what you know

                */

        }

    }

