/// mul table from m to n
package helloworld;

import java.util.Scanner;

public class MulTablefrommton {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int m=input.nextInt();
        int n=input.nextInt();
        
        for (int i = m; i<=n; i++) {
            for (int j=1; j<=10; j++){
        System.out.println(i+"*"+j+"="+i*j);
            }
            System.out.println("\n\n");
        }
    }
}
