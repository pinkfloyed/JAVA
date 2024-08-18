/*class Human
{
    private String name,Dept; // encapsulation bcoz data private, method public.
    private double cgpa;// from outside no one can access our data directly
    private int age;
    public void setName(String name) 
    {
        this.name=name;  /// this keyword refers to the current object in a method or constructor 
    }
    public void setName(String a)
    {
        name=a;
    }  
public void setDept(String Dept)
    {
        this.Dept=Dept;
    }
    public void setDept(String d)
    {
        Dept=d;
    }
    public void setCgpa(double c)
    {
        cgpa=c;
    }
    public void setAge(int g)
    {
        age=g;
    }
    public String getName()// data and methods are binding together.
    {
        return name;
    }
    public String getDept()
    {
        return Dept;
    }
    public double getCgpa()
    {
        return cgpa;
    }
    public int getAge()
    {
        return age;
    }
    public Human()
    {
        System.out.println("Constructor is class name=method name");
    }
}
public class EncapsulationJava {
    public static void main(String[] agrs)
    {
        Human h=new Human();// object create korlei constructor call hoy.
        Human h1=new Human();
        h.setName("Pinki");
        h.setDept("CSE");
        h.setCgpa(3.53);
        h.setAge(24);
        System.out.println(h.getName()+" "+h.getDept()+" "+h.getCgpa()+" "+h.getAge());
    }
}
*/
class Human
{
    private String name,Dept; 
    private double cgpa;
    private int age;
    public Human() // default constructor
    {
        name="Queen";
        Dept="EEE";
        cgpa=4.00;
        age=26;
    }
    public Human(String name,String Dept,double cgpa,int age) // parameterized constructor
    {
        this.name=name;
        this.Dept=Dept;
        this.cgpa=cgpa;
        this.age=age;
    }
    public void show()
    {
        System.out.println(name+" "+Dept+" "+cgpa+" "+age);
    }
}
public class ConstructorEncapsulation
{
    public static void main(String[] agrs)
    {
        Human h=new Human();
        Human h1=new Human("Pinks","CSE",3.53,25);
        h.show();
        h1.show();
        new Human().show();// Anonymous Object
    }
}
