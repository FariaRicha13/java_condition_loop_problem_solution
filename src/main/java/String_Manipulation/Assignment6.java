package String_Manipulation;
// Replace "R" from Rahim with "F" from the given String:
//Input: Ratul and Rahim live in Rangpur
//Output: Ratul and Fahim lives in Rangpur
public class Assignment6 {
    public static void main(String[] args) {
        try{
            String str ="Ratul and Rahim live in Rangpur";
            int s = str.indexOf("Rahim");
            char[] a= str.toCharArray();
            a[s]='F';
            System.out.println(a);


        }
        catch (Exception e)
        {
            System.out.println("Sometging went wrong!!");
        }
    }
}
