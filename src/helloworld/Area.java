/// areas perimeter 
package helloworld;

import java.util.Scanner;

public class Area {
     public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        double r,b,c,area,p;
        
        /// area and perimeter  of circle 
        r=input.nextInt();
        area=3.1416*r*r;
        p=2*3.1416*r;
        System.out.println("area = "+area);
        System.out.println("perimeter = "+p);
        
        ///triangle
        b=input.nextInt();
        c=input.nextInt();
        area=.5*b*c;
        p=(r+b+c);
        System.out.println("area = "+area);
        System.out.println("perimeter = "+p);
        
        
        ///rectangle
        area=b*c;
        p=2*(b+c);
        System.out.println("area = "+area);
        System.out.println("perimeter = "+p);
        
        ///square
        area=b*b;
        p=4*b;
        System.out.println("area = "+area);
        System.out.println("perimeter = "+p);
        
    }
}
