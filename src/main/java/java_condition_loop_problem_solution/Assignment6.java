//Write a program to find the factorial of a given number.

package java_condition_loop_problem_solution;

import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        try {
            int num,fact=1;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number to calculate it's factorial");
            num = input.nextInt();
            for(int i=1;i<=num;i++)
            {
                fact=fact*i;
            }
            System.out.println("Factorial of the number is :" + fact);
        }
        catch (Exception e)
        {
            System.out.println("Enter a valid integer number");
        }
    }
}
