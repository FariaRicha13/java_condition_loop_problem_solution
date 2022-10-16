//Input an amount from the user and find out the number of notes from input amount in given array
package Array_and_Function_problem_solution;

import java.util.*;

public class Assignment2 {
    public static void main(String[] args) {
        try{
            Integer arr[]={1000,500,100,50,20,10,5,2,1};
            Arrays.sort(arr, Collections.reverseOrder());
            HashMap<Integer,Integer> val = new HashMap<>();
            System.out.println("Please enter an amount: ");
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            int amount=0;
            for(int i=0;i<arr.length;i++)
            {
                if(num>=arr[i])
                {
                    int a = num/arr[i];
                    num=num-a*arr[i];
                    val.put(arr[i],a);
                }
            }
            SortedSet<Integer> keys = new TreeSet<>(val.keySet());
            for (Integer key : keys) {
                System.out.println(val.get(key)+"  "+key);
            }

        }
        catch (Exception e)
        {
            System.out.println("Enter a valid amount in Integer");
        }



    }
}
