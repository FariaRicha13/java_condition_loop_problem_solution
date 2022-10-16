//Take 5 numbers from users in an array. Then find out the average number, how many even and how many odd numbers using these functions: average(), countEvenNumbers(), countOddNumbers().
package Array_and_Function_problem_solution;

import java.util.Scanner;

public class Assignment5 {
    static void  average(int [] arr)
    {double sum=0;
        double avg;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+(double) arr[i];
        }
        avg= (sum/arr.length);
        System.out.println("The average of the array is :"+avg);
    }
    static void countEvenNumbers(int [] arr)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                count=count+1;
            }

        }
        System.out.println("The count of even numbers are: "+count);
    }
    static void countOddNumbers(int [] arr)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                count=count+1;
            }

        }
        System.out.println("The count of odd numbers are: "+count);
    }
    public static void main(String[] args) {
        try{
            int [] arr = new int[5];
            System.out.println("Enter 5 numbers as array inputs: ");
            Scanner input = new Scanner(System.in);
            for(int i=0;i<5;i++)
            {
                arr[i]= input.nextInt();
            }
            average(arr);
            countEvenNumbers(arr);
            countOddNumbers(arr);
        }
        catch (Exception e)
        {
            System.out.println("Please Enter a valid integer");
        }
    }
}
