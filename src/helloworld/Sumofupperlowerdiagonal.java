/// sum of upper lower triangle diagonal of matrix
package helloworld;

import java.util.Scanner;

public class Sumofupperlowerdiagonal {
    public static void main(String[] args) {

    Scanner input=new Scanner(System.in);
        int n,m;
        int s=0,uppersum=0,lowersum=0;
        n=input.nextInt();
        m=input.nextInt();
        int[][] a=new int [n][m];
        int[][] b=new int [n][m];
        for (int r = 0; r<n; r++) {
            for (int c = 0; c<m; c++) {
                a[r][c]=input.nextInt();
      
            if(r==c)
            {
                s+=a[r][c];
            }
            if(r<c)
            {
                uppersum+=a[r][c];
            }
            if(r>c)
            {
                lowersum+=a[r][c];
            }
            }
        }
        System.out.println("sum of diagonal = "+s);
        System.out.println("uppersum = "+uppersum);
        System.out.println("lowersum = "+lowersum);
    }
}
