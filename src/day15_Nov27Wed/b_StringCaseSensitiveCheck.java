package day15_Nov27Wed;

public class b_StringCaseSensitiveCheck {
    public static void main(String[] args) {

      /* Nov27
        I HAVE NO IDEA WHAT THE FUCK HE'S TALKING ABOUT. HE GIVES SO MANY ALTERNATIVES AND
        EXAMPLES THAT HAVE NOTHING TO DO WITH WHAT'S ON THE SCREEN.  I'M SO ANNOYED
        I AM NOT OPEN TO LEARNING.  THANK GOD IT'S ALMOST TIME FOR A BREAK.

        Nov 30
        I used the days off to work on this stuff and it's ok now.  Im becoming annoyed with
        his teaching style, but since i cant change that i need to change me.  Im gonna try less
        Slack during the class.  I'm gonna train myself to listen to the parts I need to hear, and
        block out the rest.  My lower back hurts a lot today, the physical part is limiting my
        study. Maybe that's actually good so i get up and move around.  I need to get intelliJ project
        move to the laptop so I can do more standing and moving around during his chitchats.

        I'm still really slow, so im not sure how im gonna manage todays class (SAT)
        Now do this exercise from Weds class*/

       // String name = "Arya Shark";
        /*check name contains st no matter case
        store the uppercase version of this name then check for ST
        then do it all on one line*/

        String name = "Arya Stark";
        boolean contLet = name.contains("st");
        name.equalsIgnoreCase("st");
        if(contLet = true) {
            System.out.println("The name contains st");
        }else{
            System.out.println("Name does not contain st");
        }


       // String upperCaseName = name.toUpperCase();  //ARYA STARK


    }
}
