package day11_Nov23Sat;

public class a_LightSwitchesInVariousRooms_CaseBreak {
    public static void main(String[] args) {

    /*Create class called WarmUp1_LightOnOff
            Create a variable  targetOption as String and assign one of below options  for example bd
    You have 4 switches in your home to turn on
    Bd — bedroom
    Lr  — living room
    ki  — kitchen
    Ha— Hallway
    Use switch statement to write a program to print which room light is turned on
    For example if Bd was targetOption
    then print  you have turned on bedroom light
     */


        String room = "H";
        switch (room) {

            case "Bd":
                System.out.println("This turns the light on in the Bedroom.");
                break;
            case "Lr":
                System.out.println("This turns the light on in the Living Room.");
                break;
            case "Ki":
                System.out.println("This turns the light on in the Kitchen.");
                break;
            case "Ha":
                System.out.println("This turns the light on in the Hallway.");
                break;
            default:
                System.out.println("I don't recognize that room.  Want to try again?");
        }


    }
}
