///user input

package helloworld;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        double d=input.nextDouble();
        String s=input.next();
        System.out.printf("n=%d\n",n);
        System.out.printf("d=%f\n",d);
        System.out.printf("%s\n",s);
    }
}
