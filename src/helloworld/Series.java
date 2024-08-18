/// series sum
package helloworld;

import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int s = 0;
        double ans=0.0;
        for (int i = 1; i<=n; i++) {
            s+=i;
            System.out.print(i+" ");
        }
            System.out.println(s);
        
        for (int i = 1; i<=n; i+=2) {
            s+=i;
            System.out.print(i+" ");
        }
            System.out.println(s);
        
        for (int i = 2; i<=n; i+=2) {
            s+=i;
            System.out.print(i+" ");
        }
            System.out.println(s);
        
        
        for (int i = 1; i<=n; i++) {
            ans+=Math.pow(i, 2);
            System.out.print(i+" ");
            
        }
        System.out.println(ans);
    }
}
