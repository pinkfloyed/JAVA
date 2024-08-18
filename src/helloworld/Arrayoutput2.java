
package helloworld;


public class Arrayoutput2 {
   public static void main(String[] args) {
   
        int k=0;
        
        int[][] a=new int[4][ ];
        
        for (int i=0;i<4;i++) {
            for (int j=0;j<i+1;j++) {
                a[i][j]=k;
                k++;
            }
       }
        for (int i=0;i<4;i++) {
            for (int j=0;j<i+1;j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
       }
    } 
}
