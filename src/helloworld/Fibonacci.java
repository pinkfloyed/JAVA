/// fibonacci without array
package helloworld;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int f=0,s=1,fibo;
        System.out.print(f+" "+s+" ");
        for (int i = 3; i<=n; i++) {
            fibo=f+s;
            System.out.print(fibo+" ");
            f=s;
            s=fibo;
        }
    }
}
