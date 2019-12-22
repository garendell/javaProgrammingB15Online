package day17_Dec1Sun;

public class h_BackwardsCountinOdd {
    public static void main(String[] args) {

        int x =100;
        while (x >0) {
            if (x % 2 != 0) {
                System.out.println(x + " odd");
            }
            --x;
        }
    }
}
