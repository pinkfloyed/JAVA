/// vowel consonant
package helloworld;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        char c;
        c=input.next().charAt(0);
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
        {
            System.out.println("vowel");
        }
        else
            System.out.println("consonant");
    }
}
