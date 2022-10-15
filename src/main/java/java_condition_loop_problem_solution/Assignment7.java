// Write a program to print prime numbers from 2 to n.
package java_condition_loop_problem_solution;
import java.lang.Math;

import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        try{
            System.out.println("Enter a number till which you want to find all the prime numbers");
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();

            for(int i=2;i<=num;i++)
            { int flag=1;
                int r = (int) Math.sqrt(i);
                for(int j=2;j<=r;j++)
                {
                    if(i%j==0)
                    {
                        flag=0;
                    }
                }
                if(flag==1)
                {
                    System.out.println(i);
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("Enter an integer number");
        }
    }
}
