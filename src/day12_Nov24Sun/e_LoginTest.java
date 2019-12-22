package day12_Nov24Sun;

public class e_LoginTest {
    public static void main(String[] args) {

        /*Task4

         String str = "abc"
    str.equals("abc") --> true    ! str.equals("abc)..> false

    create a class called LoginTest with main method
    create 2 String variables called userName and password
    and do the following:

    username  user123   and
    password is pass123
    Check if both are correct
    if so print login successful
    if not
    check userName correct
    if not say userName not correct
    check password correct
    if not say password not correct

    copied from Aleysa:
       String userName="user123";
        String password ="pass123";
        if(userName.equals("user123")&&password.equals("pass123")){
            System.out.println("Log in succesful");
        }else if(!userName.equals("user123") && password.equals("pass123")){
            System.out.println("Wrong username!");
        }else if(!password.equals("pass123") && userName.equals("user123")){
            System.out.println("Wrong password!");

     */
      String userName = "user124", password = "pass124"; //if same data type, can assign value in one line

      if (userName.equals("user123") && password.equals("pass123")){
          System.out.println("Login Successful");
      }else if (!userName.equals ("user123")){
          System.out.println("Incorrect user name.  Would you like to try again or get help?");
      }else if (!password.equals ("pass123")) {
          System.out.println("Incorrect password.  Try again or get help?");

          }

      }
    }