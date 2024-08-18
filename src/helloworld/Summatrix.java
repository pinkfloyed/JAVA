/// sum of two matrix
package helloworld;

import java.util.Scanner;

public class Summatrix {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,m;
        n=input.nextInt();
        m=input.nextInt();
        int[][] a=new int [n][m];
        int[][] b=new int [n][m];
        for (int r = 0; r<n; r++) {
            for (int c = 0; c<m; c++) {
                a[r][c]=input.nextInt();
            }
       }
        for (int r = 0; r<n; r++) {
            for (int c = 0; c<m; c++) {
                b[r][c]=input.nextInt();
            }
       }
         for (int r = 0; r<n; r++) {
            for (int c = 0; c<m; c++) {
                System.out.print(""+a[r][c]+" ");
            }
             System.out.println();
       }
         for (int r = 0; r<n; r++) {
            for (int c = 0; c<m; c++) {
                System.out.print(""+b[r][c]+" ");
            }
             System.out.println();
       }
         for (int r = 0; r<n; r++) {
            for (int c = 0; c<m; c++) {
                System.out.print(""+(a[r][c]+b[r][c])+" ");
            }
             System.out.println();
       }
    }
}
