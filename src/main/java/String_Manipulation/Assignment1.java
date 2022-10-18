package String_Manipulation;

public class Assignment1 {
    public static void main(String[] args) {
        try {
            String text ="<html>\n" +
                    "<title>Test</title>\n" +
                    "<body>\n" +
                    "Your trnx is successful. Trnx Id is: TXN123456\n" +
                    "</body>\n" +
                    "</html>";
            int n = text.indexOf("TXN");
          //  System.out.println(n);
            char c=text.charAt(n);
            int count=0;
            while(c!='\n')
            {
                count++;
                c=text.charAt(n+count);

            }
          // System.out.println(count);
            System.out.println(text.substring(n,n+count));





        }
        catch (Exception e)
        {

        }
    }
}
