/// prime number
package helloworld;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int c=0;
        for (int i = 2; i < n; i++) {
            if(n%i==0){
                 c++;
                 break;
            }
        }
        if(c==0)
            System.out.println("prime number");
        else
            System.out.println("not prime");
    }
}
