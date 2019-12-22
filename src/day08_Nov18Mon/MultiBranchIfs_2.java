package day08_Nov18Mon;

public class MultiBranchIfs_2 {
    public static void main(String[] args) {
/*
        given currentSpeed, speedLimit = 60
        check whether current is more than 90 -- > jail
        more than 80 but less than 90 --> reckless driving fine
        more than 70 but less than 80 --> get points
        more than 60 but less than 70 -->  warning
        if not speeding, keep driving
*/
        int currentSpeed = 85;
        System.out.println("Speed Limit is 60.");
        System.out.println("Your current speed is "+currentSpeed);
        System.out.println("If you had been speeding more than 90, you would have gone to jail.");
        if (currentSpeed > 80){
        System.out.println("Your speed is between 80 and 90: This is reckless driving.");
    }else if(currentSpeed>70) {
            System.out.println("Your speed is between 70 and 80: You get points on your license.");
        }else if (currentSpeed>60) {
            System.out.println("Your speed is between 60 and 70: Warning! Please slow down.");
        }else{
            System.out.println("This time you are not speeding at all.  Carry on and stay safe!");

        }


    }
}
