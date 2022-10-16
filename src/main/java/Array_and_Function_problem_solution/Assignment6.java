//Suppose a software system excepts valid credentials from user to logged in to the system. if the user inputs wrong password for 3 times, system will say that "Your user has been temporary locked". Let the username: admin, password: adm1n
package Array_and_Function_problem_solution;

import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        try{
            String username ="admin";
            String password ="adm1n";
            String in_uname,in_pass;
            Scanner input= new Scanner(System.in);
            int i=1;
            while(true)
            { if(i==4)
            {
                System.out.println("Your user has been temporary locked");
                break;
            }
                System.out.println("Please Enter username: ");
                in_uname=input.next();
                System.out.println("Please Enter password: ");
                in_pass=input.next();

                if((in_uname.equals(username))&&(in_pass.equals(password)))
                {
                    System.out.println("You Have Logged in Successfully");
                    break;
                }
                else if((!in_uname.equals(username))&&(in_pass.equals(password)))
                {
                    System.out.println("You have entered incorrect username.");
                }
                else if((in_uname.equals(username))&&(!in_pass.equals(password)))
                {
                    System.out.println("You have entered incorrect password.");
                    i++;
                }
                else if((!in_uname.equals(username))&&(!in_pass.equals(password)))
                {
                    System.out.println("You have entered incorrect email and password");
                    i++;
                }



            }












        }
        catch(Exception e)
        {
            System.out.println("Please enter a valid input");
        }
    }
}
