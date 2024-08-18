/// array max min
package helloworld;

import java.util.Scanner;


public class Arraymaxmin {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        n=input.nextInt();
        int[]a=new int[n];
        
        for (int i = 0; i < n; i++) {
           a[i]=input.nextInt();
       }
        int max=a[0];
        int min=a[0];
        for (int i = 1; i<n; i++) {
            if(a[i]>max)
                max=a[i];
            if(a[i]<min)
                min=a[i];
        }
        System.out.println(max);
        System.out.println(min);
        
        
        
        /// for each loop
        for(int x:a)
        {
            System.out.print(x+" ");
        }
        System.out.println();
   }
}
