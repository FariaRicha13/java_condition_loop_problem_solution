package Array_and_Function_problem_solution;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment7 {
    public static void main(String[] args) {
        try{
            ArrayList<Integer>dups=new ArrayList<Integer>();
            int arr[]={1, 5, 2, 2, 3, 4, 3, 5, 2, 6, 7, 9, 8, 5};
            Arrays.sort(arr);

            for(int i=0;i<arr.length-1;i++)
            {
                if((arr[i]==arr[i+1])&&(!dups.contains(arr[i])))

                {

                        dups.add(arr[i]);



                }
            }
            for(int a:dups)
            {
                System.out.println(a+"\n");
            }
        }
        catch (Exception e)
        {
            System.out.println("Error has occured");
        }
    }
}
