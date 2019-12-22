package day19Dec3Tue;
import java.util.Scanner;
public class b_SpeedUp_ForLoop_stating2Variables {
    public static void main(String[] args) {

        //start speed is always less than end speed
        //reate a loop to simulat slow increase of speed
        //ex  if start 10, end 27.
        //print increasing speed from start to finish
        //my code:


        for (int i = 10; i <=27 ; i++) {
            System.out.print(i+ ", ");
        }

        //here's akbar's code:  (another way to do it; also just an illustration of the meaning of i in the statement)
        //use Scanner

        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        int end = scan.nextInt();
        for (int i= start; i <=end; i++ ){
            System.out.println(i);
        }
        //_____________________________________________________
        //OR  you can use an if statement with a loop inside
        System.out.println("increasing the speed");
        for(int i= start;  i <= end; i++){

            if (start > end) {
                System.out.println("decreasing speed ");
                for (int x = start; x >= end; x--) ;

            }else
            System.out.println("No action needed.  Same Speed");
        }


        }
    }

