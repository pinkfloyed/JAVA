/// series multiplication
package helloworld;

import java.util.Scanner;

public class SeriesMul {
   public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int s = 1;
        double ans=1.0;
        for (int i = 1; i<=n; i++) {
           
            System.out.print(i+" ");
            s=s*i;
        }
        System.out.println(s);
        
        for (int i = 1; i<=n;i=i+2) {
           
            System.out.print(i+" ");
            s=s*i;
        }
        System.out.println(s);
        
        for (int i = 2; i<=n; i=i+2) {
            
            System.out.print(i+" ");
            s=s*i;
        }
        System.out.println(s);
        
        
        for (int i = 1; i<=n; i++) {
            ans*=Math.pow(i, 2);
            System.out.print(i+" ");
            
        }
        System.out.println(ans);
    } 
}
