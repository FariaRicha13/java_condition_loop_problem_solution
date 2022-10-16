//Create your todays bazar list/pocket expenditure which includes the item name and price. Then create a function named searchItem(String item) which will be used to search any item from your HashMap and return the price. If found no item, then print message as "No item found" and create another function named totalSum() which will return total price of items.
package Array_and_Function_problem_solution;


import java.util.HashMap;
import java.util.Scanner;


public class Assignment4 {
   public static HashMap<String,Double>list=new HashMap<>();

    public static void addToList(String name, Double price)
    {
        list.put(name,price);
    }
    public static void searchItem(String Item)
    {int flag=0;
            for(String key: list.keySet())
            {
                if(Item.equals(key))
                {   flag=1;
                    System.out.println("The price of this item: "+list.get(key));
                }
            }
            if(flag==0)
            {
                System.out.println("No item found");
            }
    }
    public static void totalSum()
    {   double sum=0.0;
        for(String key : list.keySet())
        {
            sum=sum+list.get(key);
        }
        System.out.println("The total Expenditure of today's list is: "+String.format("%.2f",sum));
    }

    public static void main(String[] args) {
        try
        { System.out.println("Please Enter an Item name to find in your list: ");
            addToList("Rice",200.00);
            addToList("Milk",50.20);
            addToList("Sugar",20.30);
            addToList("Tea",90.55);
            addToList("Coffee",120.12);
            addToList("Onion",100.10);
            addToList("Tomato",80.60);


            Scanner input = new Scanner(System.in);
            String user_item = input.next();
            searchItem(user_item);
            totalSum();
        }
        catch (Exception e)
        {
            System.out.println("Invalid Input");
        }


    }
}
