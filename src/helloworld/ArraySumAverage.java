/// array sum average
package helloworld;

import java.util.Scanner;

public class ArraySumAverage {
   public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,s=0,av=0;
        n=input.nextInt();
        int[]a=new int[100];
        
        for (int i = 0; i < n; i++) {
           a[i]=input.nextInt();
           s+=a[i];
           av=s/n;
       }
        System.out.println(s);
        System.out.println(av);
   }
}
