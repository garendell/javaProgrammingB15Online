package day05_Nov14Thu;

import java.util.Scanner;

public class e_ScannerPractice_NextBoolean {
    public static void main(String[] args) {

        //create scanner object
        Scanner input = new Scanner (System.in);

        //asking user if they are recording
        System.out.println("Is this true or false?  We are recording now!");

        boolean isRecording = input.nextBoolean();
        System.out.println(isRecording + " means yes, we are recording." );


    }


}
