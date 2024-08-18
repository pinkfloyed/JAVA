/// conditional operator
package helloworld;

import java.util.Scanner;

public class Conditional {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int a,b,ans;
        a=input.nextInt();
        b=input.nextInt();
        ans=(a>b)?a:b;
        
        System.out.println(""+ans);
    }        
}
