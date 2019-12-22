package day12_Nov24Sun;

public class a_IfElseWeather_StringEquality_dotEquals {
    public static void main(String[] args) {

        /*  Task 1      I had forgotten the .equals stuff we did yesterday.   Once reminded, I understand
                        the theory, but can't figure out the braces yet.  If I put them in a different position
                        it makes sense to me, and then java repositions them.
                        NOTE: this will also work with == if you assign ints instead of strings

        If weather Sunny   code in sunny Weather
        If weather Rainy   code in rainy weather
        If weather Cloudy
        If weather Snowy
        else
         */

        String weather = "cloudy";
        if (weather.equals("sunny")) {
            System.out.println("It's sunny.  Code in sunny weather!");
        } else if (weather.equals("rainy")) {
            System.out.println("It's rainy.  Code in rainy weather!");
        } else if (weather.equals("cloudy")) {
            System.out.println("It's cloudy.  Code in cloudy weather!");
        } else if (weather.equals("snowy")) {
            System.out.println("It's snowy.  Code in snowy weather!");
        } else {
            System.out.println("Code in any weather!");
        }

    }
}