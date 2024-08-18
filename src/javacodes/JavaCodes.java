package javacodes;
public class JavaCodes{
    public static void main(String[] args)
    {
        System.out.println("Pinki Akter Java Developer");
        int a=10;
        int b=56;
        int res=a+b;
        System.out.println(res);
        //data types
        int x=10;
        byte by=127;
        short s=678;
        long l=18927;
        float f=7.9f;
        double d=9.8;
        char c='p';
        boolean bol=true;
        System.out.println(x);
        System.out.println(by);
        System.out.println(s);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(bol);
        //literals
        int num=0b100110;
        System.out.println(num);
        int num1=0x8A;
        System.out.println(num1);
        int num2=1_00_00_000;
        System.out.println(num2);
        double d1=12e12;
        System.out.println(d1);
        char c1='b';
        c1++;
        System.out.println(c1);
        // type conversion and casting
        byte bt=126;
        int at=96;
        bt=(byte)at; /// explicit casting
        at=bt; /// implicit casting
        System.out.println(at);
        System.out.println(bt);
        float ft=4.5f;
        int xt=(int)ft;
        System.out.println(xt);
        
        byte x1=10,x2=20;
        int r=x1*x2;
        System.out.println(r);
        
        //increment/decrement(++var/--var holei change hobe. otherwise same thakbe)
        int in=10;
        int in1=10;
        int in2=10;
        int in3=10;
        System.out.println(in++);
        System.out.println(++in1);
        System.out.println(in2--);
        System.out.println(--in3);
        
        // Relational operators
        int s1=88,s2=89;
        double k1=88.9,k2=89.2;
        boolean re=s1!=s2 && k1!=k2;
        System.out.println(re);
    }
}
