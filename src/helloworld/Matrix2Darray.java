/// matrix print
package helloworld;

import java.util.Scanner;

public class Matrix2Darray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,m;
        n=input.nextInt();
        m=input.nextInt();
        int[][] a=new int [n][m];
        for (int r = 0; r<n; r++) {
            for (int c = 0; c<m; c++) {
                a[r][c]=input.nextInt();
            }
       }
         for (int r = 0; r<n; r++) {
            for (int c = 0; c<m; c++) {
                System.out.print(""+a[r][c]+" ");
            }
             System.out.println();
       }
    }
}
