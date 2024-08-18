///FormatSpecifier
package helloworld;
public class FormatSpecifier {
            
    public static void main(String[] args)        
    {
        boolean b=true;
        char c='a';
        short s=32675;
        int i=122456;
        float f=10.30f;
        double d=96.70;
        
        System.out.printf("b= %b\n",b);
        System.out.printf("c= %c\n",c);
        System.out.printf("s= %d\n",s);
        System.out.printf("i= %d\n",i);
        System.out.printf("f= %.1f\n",f);
        System.out.printf("d= %.3f\n",d);
           
    }
}
