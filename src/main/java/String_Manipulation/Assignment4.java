package String_Manipulation;
//Write a program that will give following output:
//Input: Chattogram
//Output: C8M
import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        try {
            String s;
            System.out.println("Please Enter a word: ");
            Scanner input = new Scanner(System.in);
            s = input.next();

            int n = s.length();
            char first = s.charAt(0);
            char last = s.charAt(n-1);
            first = Character.toUpperCase(first);
            last = Character.toUpperCase(last);
            n=n-2;
            System.out.println(first+""+n+""+last);

        }
        catch (Exception e)
        {

        }
    }
}
