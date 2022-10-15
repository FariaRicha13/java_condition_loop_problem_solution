//Write a program to generate 2 random numbers which will not be shown to the user. Take a user input and match it with any of the random numbers. If correct give it 1 point and if incorrect, do not give it any point. Finally, repeat this for 10 times and count the total points user achieved at the end of 10 cycle.
package java_condition_loop_problem_solution;

import java.util.Random;
import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        try{
            int ran1,ran2,min=1,max=100;
            Random randomNum = new Random();
            int num,point =0;
            int i=1;
            while(i<=10)
            {System.out.println("Please enter an integer number between 1 to 100");
                ran1 = min+randomNum.nextInt(max);
               // System.out.println(ran1);
                ran2 = min+randomNum.nextInt(max);
               // System.out.println(ran2);
                Scanner input = new Scanner(System.in);
                num = input.nextInt();
                if(num==ran1)
                {
                    point=point+1;
                }
                else if(num==ran2)
                {
                    point=point+1;
                }
              i++;
            }
            System.out.println("User gets "+point +" points");
        }
        catch (Exception e)
        {
            System.out.println("Enter an integer number please!!");
        }
    }
}
