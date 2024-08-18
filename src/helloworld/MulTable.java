/// multiplication table
package helloworld;

import java.util.Scanner;

public class MulTable {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int m = 1;
        
        for (int i = 1; i<=10; i++) {
        System.out.println(n+"*"+i+"="+n*i);
        }
    }
}
