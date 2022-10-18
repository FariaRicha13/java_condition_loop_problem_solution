package String_Manipulation;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        try{
            String str;
            System.out.println("Please Enter a word: ");
            Scanner input = new Scanner(System.in);
            str = input.next();
            str= str.toLowerCase();
            int count =0;
            for(int i=0;i<str.length();i++)
            {
                if(str.charAt(i)=='a'||
                str.charAt(i)=='e'||
                str.charAt(i)=='i'||
                str.charAt(i)=='o'||
                str.charAt(i)=='u')
                {
                    count++;
                }
            }
            System.out.println("The count of vowels: "+count);
        }
        catch (Exception e)
        {
            System.out.println("Soemthing went wrong!!!");
        }
    }
}
