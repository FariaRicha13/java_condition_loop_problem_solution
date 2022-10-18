package String_Manipulation;

public class Assignment2 {
    public static void main(String[] args) {
        try{
            String str ="Price of a formal shirt is 1200 tk and Sharee is 3500 tk. If you buy 2 shirt and 1 sharee, then 400 tk will be discounted. After your purchase what will be your total cost?";
            str=str.replaceAll("[^\\d]", " ");
            str= str.trim();
            str = str.replaceAll(" +", " ");

            String [] arr= (str.split(" "));
           double shirt_price = Double.parseDouble(arr[0]);
           double sharee_price = Double.parseDouble(arr[1]);
           double shirt_amount = Double.parseDouble(arr[2]);
           double sharee_amount = Double.parseDouble(arr[3]);
           double discount = Double.parseDouble(arr[4]);

           double cost = shirt_amount*shirt_price+sharee_amount*sharee_price-discount;

            System.out.println("The total cost is : "+cost);






        }
        catch (Exception e)
        {
            System.out.println("Something wrong happened!!!!");
        }
    }
}
