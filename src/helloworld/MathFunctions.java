/// math functions
package helloworld;

import java.util.Scanner;

public class MathFunctions {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        double a,b;
        double ans;
        a=input.nextDouble();
        b=input.nextDouble();
        System.out.println("max = "+Math.max(a,b));
        System.out.println("min = "+Math.min(a,b));
        ans=Math.pow(a,b);
        System.out.println("power = "+ans);
        
        System.out.println("round value = "+Math.round(b));
        
        double pi=Math.PI;
        System.out.println("value of pie = "+pi);
    }
        
}
