//Input 2 decimal numbers. Check if they are both same or different up to two decimal places.
package java_condition_loop_problem_solution;
import java.math.RoundingMode;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        try{
            Double num1,num2;
            DecimalFormat df = new DecimalFormat();
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your first decimal number: ");
            num1 = input.nextDouble();
            System.out.println("Enter your second decimal number: ");
            num2 = input.nextDouble();
           double a = num1 * 100;

          double b = num2 * 100;

            int a1 = (int) a;

            int b1 = (int) b;

            if (a1 == b1) {
                System.out.println("The numbers are same.");

            }

            else
                System.out.println("The numbers are not same.");



        }
        catch (Exception e)
        {
            System.out.println("Please Enter Valid Input");
        }


    }
}
