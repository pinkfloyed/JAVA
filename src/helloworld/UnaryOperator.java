/// unary operator
package helloworld;

import java.util.Scanner;

public class UnaryOperator {
   public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int x,y;
        x=input.nextInt();
        y=++x;
        System.out.println(" "+y);
        
        y=x++;
        System.out.println(" "+y);
        
        y=--x;
        System.out.println(" "+y);
        
        y=x--;
        System.out.println(" "+y);
    }
}
