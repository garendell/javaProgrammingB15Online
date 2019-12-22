package day17_Dec1Sun;

public class e_SkipCounting_OddEvenCheckerWithinRange {
    public static void main(String[] args) {

        //Skip counting by 3 from 0 to 30
        //Desired output:      3 6 9 12 15 18 21 24 27 30

        int counter =0;
        while ( counter <30){
            counter+=3 ;
            System.out.print
                    ( counter + " ");
        }
        System.out.println();
        //then do even numbers up to 50  this works no problem
        int count2=0;
                while(count2 <50){
                    count2+=2;
                    System.out.print(count2 + " ");
                }
        System.out.println();
        //then do odd numbers up to 50   how to include the number 1?
        int count3= -1;
        while(count3 <49){
            count3+=2;
            System.out.print(count3 +" ");
        }
    }
}
