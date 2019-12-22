package day08_Nov18Mon;

public class IfElseStatements {
    public static void main(String[] args) {


        int speedLimit = 60;
        int yourSpeed = 55;

        boolean IamSpeeding = (yourSpeed > speedLimit);
        System.out.println("Are you speeding?");
        if (IamSpeeding) {    //or you could say if (true)
            System.out.println("Yes, you are! You will:");
            System.out.println("get pulled over and");
            System.out.println("get a ticket.");
        }else{     //or your could say if (false)
            System.out.println("No, you're not!");
            System.out.println("Have a nice day!");
        }

        System.out.println("the end");

    }
}
