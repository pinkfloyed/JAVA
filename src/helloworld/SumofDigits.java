/// sum of digits
package helloworld;

import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int t,r,s=0;
        t=n;
        while(t!=0)
        {
            r=t%10;
            s+=r;
            t/=10;
        }
        System.out.println(s);
    }
}
