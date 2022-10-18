package String_Manipulation;

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
