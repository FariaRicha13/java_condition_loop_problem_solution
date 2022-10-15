//Write a program to sum of user input until users input ‘q’ from keyboard.
package java_condition_loop_problem_solution;

import java.util.Scanner;

public class Assignment9 {
    public static int sum=0;
    public static void main(String[] args) {
        try {

            System.out.println("Please Enter Numbers to see their sum: ");
            System.out.println("Enter q to stop giving input ");
            Scanner input = new Scanner(System.in);
            int num = 0,sum=0;
            char m='a';
            while(m!='q')
            {
                num=input.nextInt();
                m= (char)num ;
                sum=sum+num;

            }



        }
        catch (Exception e)
        {

            System.out.println("Sum: " + sum);
        }
    }
}
