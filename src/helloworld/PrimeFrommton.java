/// prime numbers from m to n
package helloworld;

import java.util.Scanner;

public class PrimeFrommton {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int m=input.nextInt();
        int n=input.nextInt();
        int c=0;
        for (int i = m; i<=n; i++) {
            for (int j = 2; j <= i-1; j++) {
                if(i%j==0){
                 c++;
                 break;
            }
            }
        if(c==0)
            System.out.println(i+" ");
        c=0;
        }
    }
}
