/// odd even from m to n
package helloworld;

import java.util.Scanner;

public class OddEvenmton {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int m=input.nextInt();
        int n=input.nextInt();
        int s = 0;
        for (int i = m; i < n; i++) {
            s+=i;
            System.out.println(i);
            System.out.println(s);
        }
        for (int i = 0; i < n; i+=2) {
            s+=i;
            System.out.println(i);
            System.out.println(s);
        }
        for (int i = 1; i < n; i+=2) {
            s+=i;
            System.out.println(i);
            System.out.println(s);
        }
    }
}
