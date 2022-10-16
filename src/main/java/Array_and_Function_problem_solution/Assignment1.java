// Take input from a user and check if the number exists in the array.
package Array_and_Function_problem_solution;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        try{
            int flag=0;
            int arr[]={1,3,5,7,2,4,6,8};
            System.out.println("Please enter a valid integer to check if exists in the given array or not: ");
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();

            for(int i=0;i<arr.length;i++)
            {
                if(num==arr[i])
                {

                    flag=1;
                    System.out.println("Found in the position "+i);
                }
            }

            if(flag==0)
            {
                 System.out.println("Found no element");
            }

        }
        catch (Exception e)
        {
            System.out.println("Please enter an integer");
        }


    }
}
