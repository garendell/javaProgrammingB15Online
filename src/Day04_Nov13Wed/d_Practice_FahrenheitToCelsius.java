package Day04_Nov13Wed;
import java.util.Scanner;

public class d_Practice_FahrenheitToCelsius {

    public static void main(String[] args) {


        // Task:  make a program to calculate temp conversion from fahrenheit to celsius, using scanner:
        // celsius = (5.0 / 9) * (fahrenheit -32)

        System.out.println("What's the temp in Fahrenheit today?");
        Scanner input = new Scanner(System.in);
       int Fahrenheit = input.nextInt();

       float celsius = (5f / 9) * (Fahrenheit -32);
        System.out.println("That's the same as about "+ celsius+ " Celsius.");

    }


}
