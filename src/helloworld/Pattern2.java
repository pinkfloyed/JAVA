///pattern 2
package helloworld;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        n=input.nextInt();
        
        for (int r = n; r>=1; r--) {
            for (int c = 1; c<=r; c++) {
                System.out.print(""+c+" ");
            }
            System.out.println();
       }
        System.out.print("\n\n");
        for (int r = n; r>=1; r--) {
            for (int c = 1; c<=r; c++) {
                System.out.print(""+r+" ");
            }
            System.out.println();
       }
        
        System.out.println("\n\n");
        for (int r = n; r>=1; r--) {
            for (int c = 1; c<=r; c++) {
                System.out.print(""+c%2+" ");
            }
            System.out.println();
       }
        System.out.print("\n\n");
        for (int r = n; r>=1; r--) {
            for (int c = 1; c<=r; c++) {
                System.out.print(""+r%2+" ");
            }
            System.out.println();
       }
        System.out.println("\n\n");
      
   }
}
