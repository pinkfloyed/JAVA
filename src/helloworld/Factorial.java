///factorial of number
package helloworld;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int f = 1;
        
        for (int i = 1; i<=n; i++) {
            f=f*i;
        }
        System.out.println("factorial = "+f);
    }
}
