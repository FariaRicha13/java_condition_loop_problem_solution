
////Write a program to check your balance, deposit balance and withdraw balance from ATM booth.
package java_condition_loop_problem_solution;

import java.util.Scanner;

public class Assignment4 {
    public static double balance=1000000;
    public static double with_amnt;
    public static double dep_amnt;
    public static void main(String[] args) {
        try{

            Scanner input = new Scanner(System.in);
            int num=100;
            while(true)
            {   System.out.println("To check your balance enter 1");
                System.out.println("To withdraw balance enter 2");
                System.out.println("To deposit balance enter 3");
                System.out.println("To exit enter 0\n\n");
                num=input.nextInt();
                if(num==0 )
                {System.out.println("You have exited from the operation sucessfully. ");
                    break;
                }
                else if(num==1)
                {
                    System.out.println("Your current balance is: "+balance+"\n\n");
                }
                else if(num==2)
                {
                    System.out.println("Enter the amount you want to withdraw: ");
                    with_amnt=input.nextDouble();
                    balance=balance-with_amnt;
                }
                else if(num==3)
                {
                    System.out.println("Enter the amount you want to deposit: ");
                    dep_amnt=input.nextDouble();
                    balance=balance+dep_amnt;
                }

            }


        }
        catch(Exception e)
        {
            System.out.println("Please give a valid input");
        }
    }
}
