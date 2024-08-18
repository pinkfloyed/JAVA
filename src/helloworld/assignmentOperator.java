/// assignment operator
package helloworld;

import java.util.Scanner;


public class assignmentOperator {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int a,b,ans;
        a=input.nextInt();
        b=input.nextInt();
        
        a+=b;
        System.out.printf("sum = %d\n",a); 
        
        a-=b;
        System.out.printf("sub = %d\n",a);
        
        a/=b;
        System.out.printf("div = %d\n",a);
        
        a*=b;
        System.out.printf("mul = %d\n",a);
         
        a%=b;
        System.out.printf("mod = %d\n",a);
    }
}
