package day08_Nov18Mon;

public class MultiBranchIfStatement {
    public static void main(String[] args) {
        /*
        given currentSpeed, speedLimit = 60
        check whether current is more than 90 -- > jail
        more than 80 but less than 90 --> reckless driving fine
        more than 70 but less than 80 --> get points
        more than 60 but less than 70 -->  warning
        if not speeding, keep driving

        ONE OF THE MAIN POINTS HERE IS THAT THE PROGRAM ALWAYS RUNS FROM TOP TO BOTTOM.
        IF THE FIRST CONDITION IS ALREADY STATED, IT WILL BE ASSUMED IN THE SECOND ONE.
        ALSO, IF THE SEQUENCE IS WRONG, THE OUTPUT WILL BE WRONG.

        THIS IS ONE OF THE MOST COMMON PROGRAMMING MISTAKES - OUT OF SEQUENCE (WITH MULTIPLE IFs).
        SEQUENCE GOES FROM MORE SPECIFIC TO LESS SPECIFIC.
         */

        System.out.println("The speed limit is 60.");
        int currentSpeed = 45;
        System.out.println("Your speed is "+ currentSpeed);
        if (currentSpeed > 70) {
            System.out.println("You are speeding more than 70:  Get points.");
        } else if (currentSpeed > 60) {
                System.out.println("You are speeding more than 60 but less than 70: Get Warning.");
            }else{
            System.out.println("You are not speeding. Carry on, and stay safe!");
    }
}
}