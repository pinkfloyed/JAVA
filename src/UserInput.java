import java.io.IOException;
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) throws IOException
    {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n);
        //int n=System.in.read();
        //System.out.println(n-48);
        int i=2,j=0;
        try
        {
            j=18/i;
            System.out.println("Bye");
        }
        catch(Exception e)
        {
            System.out.println("Exception is e");
            System.out.println("Bye");
        }
        finally
        {
            
        }
    }
}
