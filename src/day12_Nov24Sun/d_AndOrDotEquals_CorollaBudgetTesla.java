package day12_Nov24Sun;

public class d_AndOrDotEquals_CorollaBudgetTesla {
    public static void main(String[] args) {

        /* Imagine HardCore Corolla fan
        Buy Corolla (regardless of budget)
        or Tesla (ONLY IF within your budget)
        if corolla is in budget, buy it
        if Tesla is in budget, buy it
         */

        String carBrand = "corolla";
        int price = 100000;
        int budget = 40000;


        if (  carBrand.equals("corolla") || (carBrand.equals("tesla") && price<= budget)  ){
            System.out.println("car acquired");

        }else{
            System.out.println("not what I'm looking for");
        }
//the idea here is that if you are going to take the same action either way,
// you can do it in one line of code as opposed to the following:

        if (carBrand.equals("corolla")  ) {
            System.out.println("corolla car acquired");
        }else if (carBrand.equals ("tesla")&& price <+budget ) {
            System.out.println("tesla car acquired");
        }else{
            System.out.println("not what I'm looking for ");
        }
        //alternatively, there's an advantage to separating the lines
        //because you can add Corolla acquired or Tesla acquired

    }
}
