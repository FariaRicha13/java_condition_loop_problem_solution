// Write a program according to the following output:
//********************Welcome to the Guessing Game! ********************
//        ********************A number is already generated. ********************
//        *****To win, you have 5 chances to guess the generated number. *****
package java_condition_loop_problem_solution;
import java.util.Random;
import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Random randomNum = new Random();
        System.out.println("\t\t********************Welcome to the Guessing Game! ********************\n");
        System.out.println("\t\t ********************A number is already generated. ********************\n");
        System.out.println("\t\t*****To win, you have 5 chances to guess the generated number. *****\n");
        int min =1;
        int max=100;
        int flag=0;
        int rand = min + randomNum.nextInt(max);
       //System.out.println(rand);
        int i=0;
        while(true) {
            if(i==5)
            {
                System.out.println("Your 5 chances are finished");
                if(flag==0)
                {
                    System.out.println("Oops! sorry you did not get any point.\n Better Luck Next Time!!");
                }
                break;
            }
            Scanner input = new Scanner(System.in);
            System.out.println("Please, enter an Integer value that you can guess, between 1 to 100: ");
            int a = input.nextInt();

            if (a < rand) {
                System.out.println("Your input is lower than the generated number.");
            } else if (a > rand) {
                System.out.println("Your input is higher than the generated number.");
            } else if (a == rand) {
                System.out.println("Great! You have guessed the correct number.\n\n Congratulation!! You win!! ");
                flag=1;
                break;
            }

            i++;
        }
    }
}
