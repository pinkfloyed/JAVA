/*class Calc
{
    public int add(int a,int b)
    {
        return a+b;
    }
    public int sub(int a,int b)
    {
        return a-b;
    }
}
class advcalc extends Calc
{
    public int mul(int a,int b)
    {
        return a*b;
    }
    public int div(int a,int b)
    {
        return a/b;
    }
    public int mod(int a,int b)
    {
        return a%b;
    }
    
}
public class InheritancePolymorphism {
    public static void main(String[] args)
    {
        advcalc a=new advcalc();
        System.out.println(a.add(10,20));
        System.out.println(a.sub(20,14));
        System.out.println(a.mul(3,6));
        System.out.println(a.div(10,5));
        System.out.println(a.mod(5, 2));
        
    }
}

class A /// every class in JAVA extends object
{
     public A()
     {
        super();
        System.out.println("Default constructor A");
     }
     public A(int a)
     {
        super();
        System.out.println("Parameterized constructor A");
     }
}
class B extends A // here, class B extends class A
{
     public B()
     {
        super(2);
        System.out.println("Default constructor B");
     }
     public B(int b)
     {
        this();
        System.out.println("Parameterized constructor B");
     }
}
*/
// Method overriding (different class but method name same,parameters same. overrides method)
import java.util.ArrayList;
class A
{
    public void show()
    {
        System.out.println("Method Overriding A");
    }
    
}
class B extends A
{
    public void show()
    {
        System.out.println("Method Overriding B");
    }
    
}
class Laptop
{
    String model;
    int price;
    public String tostring() // object class equals tostring hashcode
    {
        return "Hey";
    }
}
public class InheritancePolymorphism {
    public static void main(String[] args)
    {
        ArrayList list=new ArrayList<>();
        B b=new B();
        b.show();
        Laptop l=new Laptop();
        l.model="BMW-Car";
        l.price=1000000;
        System.out.println(l.model+" "+l.price);
    }
}