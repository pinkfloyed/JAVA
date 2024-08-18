/// check letters
package helloworld;

import java.util.Scanner;

public class Letters {
    
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        char c;
        c=input.next().charAt(0);
        if(c>='a'  && c<='z')
        {
            System.out.println("small letter");
        }
        else if(c>='A' && c<='Z')
            System.out.println("capital letter");
        else
            System.out.println("not a letter");
    }
}
