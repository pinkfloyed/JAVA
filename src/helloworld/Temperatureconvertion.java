/// temperature conversion
package helloworld;

import java.util.Scanner;

public class Temperatureconvertion {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        double c,f;
        
        /// 
        c=input.nextDouble();
        f=(1.8*c)+32;
        System.out.println("farenheit = "+f);
        
        f=input.nextDouble();
        c=(.55555555)*(f-32);
        System.out.println("celsius = "+c);
    }
        
}
