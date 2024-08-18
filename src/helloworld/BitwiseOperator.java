///bitwise operator
package helloworld;

import java.util.Scanner;

public class BitwiseOperator {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int a,b,ans;
        a=input.nextInt();
        b=input.nextInt();
        
        ans=a&b; /// bitwise and
        System.out.println(""+ans);
        
        ans=a|b; /// bitwise or
        System.out.println(""+ans);
        
        
        ans=a^b; /// bitwise xor
        System.out.println(""+ans);
        
        
        /// right shift mane totobar 2diye divide krbo
        ans=a>>3;
        System.out.println(""+ans);
       
        
        /// left shift mane totobar 2diye gun krbo
        ans=a<<3; 
        System.out.println(""+ans);
    } 
}
