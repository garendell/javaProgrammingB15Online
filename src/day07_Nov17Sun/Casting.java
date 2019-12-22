package day07_Nov17Sun;

public class Casting {
    public static void main(String[] args) {

        // int num = 10;

        double bigNum = 10;
        System.out.println( bigNum );  //running this gives 10.0


        int num = (int) 12.99;
        System.out.println(num);

        // this truncates the decimal, and it prints as 12
        //when do we need casting?

        long earthToMoon = 10000;
                int earthToMoonIn_miles = (int) earthToMoon;
        System.out.println(earthToMoonIn_miles);





    }
}
