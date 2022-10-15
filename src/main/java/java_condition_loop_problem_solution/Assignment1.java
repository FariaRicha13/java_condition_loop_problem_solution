//Write a program to check if inputted letter is small or capital.

package java_condition_loop_problem_solution;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(System.in);
            System.out.println("Please Enter a Letter");
            char c = input.next().charAt(0);

            if(Character.isUpperCase(c))
            {
                System.out.println("The letter is capital letter");
            }
            else if (Character.isLowerCase(c))
            {
                System.out.println("The letter is small letter");
            }
            else
            {
                System.out.println("Please enter a character");
            }
        }
        catch(Exception e)
        {
            System.out.println("Please enter a character");
        }
    }
}
