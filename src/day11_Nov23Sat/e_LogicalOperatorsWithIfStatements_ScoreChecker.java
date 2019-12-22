package day11_Nov23Sat;

public class e_LogicalOperatorsWithIfStatements_ScoreChecker {
    public static void main(String[] args) {

        /* create a program to check the score : ScoreChecker with main method
        create a variable called score and assign a value of your choice

        if the score is less than 0 OR more than 100    Invalid score
        if the score is 100                     perfect score
        if the score is between 70-100          you have passed
        else                                    you have not passed yet

        Optional : add more conditions
        if the score is less than 20            speak with teacher during office hours
        if the score is between 30 and 40       attend additional classes
        if the score is between 40 and 70       a little more study is all you need
         */

        int score = 68;
        if (score <0 || score >100) {
            System.out.println(score + " is less than 0 or more than 100:  invalid score.");
        }else if (score == 100) {
            System.out.println(score + " is 100.  Perfect score!");
        }else if (score >70 && score<100) {  //also could just say score>70 bc already established <100
            System.out.println(score + " is between 70 and 100.  You passed!");
        }else{
            System.out.println(score + " is less than 70.  You haven't passed yet.");
        }

    }

}
