package String_Manipulation;
//Write a program to convert each 1st char to uppercase from a string
//Input: rahim lives in sylhet
//Output: Rahim Lives in Sylhet
import java.util.Scanner;

public class Assignment8 {
    public static void Captilizer(String st)
    {   String [] words = st.split("\\s");

        String res="";
        for(String w:words)
        {
            String first_char = w.substring(0,1);
            String next_char = w.substring(1,w.length());
            res= res+first_char.toUpperCase()+next_char+" ";

        }
        System.out.println(res.trim());
    }
    public static void main(String[] args) {
        try{
            String s;
            System.out.println("Enter a sentence please: ");
            Scanner input = new Scanner(System.in);
            s = input.nextLine();

            Captilizer(s);
        }
        catch (Exception e){
            System.out.println("Please Enter a valid input");
        }
    }
}
