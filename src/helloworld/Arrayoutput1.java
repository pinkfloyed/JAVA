/* array output
0 1 2 3
4 5 6 7
8 9 10 11
*/
package helloworld;

import java.util.Scanner;

public class Arrayoutput1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,m,k=0;
        n=input.nextInt();
        m=input.nextInt();
        int[][] a=new int [n][m];
        int[][] b=new int [n][m];
        for (int r = 0; r<n; r++) {
            for (int c = 0; c<m; c++) {
                a[r][c]=k;
                k++;
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
