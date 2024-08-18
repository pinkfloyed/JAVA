///control statement
package helloworld;

import java.util.Scanner;

public class ControlStatement {
  public static void main(String[]args)
  {
      Scanner input=new Scanner(System.in);
      int x,y;
        x=input.nextInt();
        if(x>0)
        {
            System.out.println("positive");
        }
        else if(x<0)
        {
            System.out.println("negative");
        }
        else
            System.out.println("zero");
  }
}
