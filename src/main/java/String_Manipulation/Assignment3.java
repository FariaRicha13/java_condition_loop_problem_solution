package String_Manipulation;

public class Assignment3 {
    public static void main(String[] args) {
        try{
            String str ="Core i 7 HP laptop price is 76000 tk and cash payment discount 10%.";
            str=str.replaceAll("[^\\d]", " ");
            str= str.trim();
            str = str.replaceAll(" +", " ");

            String [] arr= (str.split(" "));

            double price = Double.parseDouble(arr[1]);
            double discount = Double.parseDouble(arr[2]);
            double cost = price-(price*(discount/100));
            System.out.println("The cost of the laptop after discount is : "+cost);
        }
        catch (Exception e)
        {
            System.out.println("OOps!! Something went wrong!!");
        }
    }
}
