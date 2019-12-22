package day17_Dec1Sun;

public class d_WhileLoop {
    public static void main(String[] args) {

        //Count 1 to 5 then count 5 to 1
        // he keeps saying "don't guess" what happened in each iteration ... why is he saying that?
        //he's encouraging us to write down each iteration (!!  ????)

        int counter = 1;
        while(counter <=5){
            System.out.print(counter+" ");
            ++counter;
        }
        System.out.println();
        System.out.println("how much is the counter at the end: counter= " +counter); //6



/*        int counter2 = 5;
        while ( counter2 >0 ){
            System.out.print(counter2+" ");
            --counter2 ;
            */


        }
    }

