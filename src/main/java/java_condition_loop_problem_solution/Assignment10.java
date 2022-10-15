//Write a program to enter the numbers till the user wants and at the end, the program should display the largest and smallest numbers user entered.
package java_condition_loop_problem_solution;

import java.util.Scanner;

public class Assignment10 {
    public static int min=101;
    public static int max=-1;
    public static void main(String[] args) {
      try{
          System.out.println("Please Enter numbers in the range of 0 to 100");
          System.out.println("Enter q to stop.");
          Scanner input = new Scanner(System.in);
          int num=0;
          char m='a';
          while(m!='q')
          {
              num=input.nextInt();
              m=(char) num;
              if(num<=min)
              {
                  min=num;
              }
              else if(num>=max)
              {
                  max=num;
              }
          }
      }
      catch (Exception e)
      {
          System.out.println("The largest number is : "+ max);
          System.out.println("The smallest number is : "+ min);
      }
    }

}
