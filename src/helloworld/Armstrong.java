/// armstrong number
package helloworld;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        n=input.nextInt();
        int t,r,s=0;
        t=n;
        while(t!=0)
        {
            r=t%10;
            s=s+r*r*r;
            t/=10;
        }
        if(n==s)
        {
            System.out.println("armstrong number");
        }
        else
            System.out.println("not armstrong");
        
    }
}
