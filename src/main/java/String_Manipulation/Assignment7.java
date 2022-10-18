package String_Manipulation;

public class Assignment7 {
    public static void main(String[] args) {
        try{
            int count=0;
            String [] arr = {"photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"};
            for(int i=0;i<arr.length;i++)
            {
                if((arr[i].contains(".jpg"))||(arr[i].contains(".png")))
                {
                    count++;
                }
            }
            System.out.println("The amount of images: "+count);
        }
        catch (Exception e){
            System.out.println("Something went wrong!!!");
        }
    }
}
