/// for loop while loop
package helloworld;

import java.util.Scanner;

public class ForLoop {
   public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for(int i=n;i>=1;i--)
        {
            System.out.println(i);
        }
        int j=1;
        while(j<=n)
        {
            System.out.println(j);
            j++;
        }
    }
}
