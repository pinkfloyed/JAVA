/// arithmetic
package helloworld;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int a,b,ans;
        a=input.nextInt();
        b=input.nextInt();
        
        ans=a+b;
        System.out.printf("sum = %d\n",ans); 
        
        ans=a-b;
        System.out.printf("sub = %d\n",ans);
        
        double an=(double) a/b;
        System.out.printf("div = %.4f\n",an);
        
        ans=a*b;
        System.out.printf("mul = %d\n",ans);
         
        ans=a%b;
        System.out.printf("mod = %d\n",ans);
    }
}
