/// break continue
package helloworld;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i==20)
                break; /// ei value pele break krbe
            System.out.println(i);
        }
        for(int i=1;i<=n;i++)
        {
            if(i==30)
                continue; /// ei value bade baki value gula print krbe
            System.out.println(i);
        }
    }
}
