/*class Demo
{
    public int add(int a,int b)
    {
        return a+b;
    }
}
public class ClassObjects {
    public static void main(String[] args)
    {
        int p=10,q=20;
        Demo d=new Demo();
        int r=d.add(p,q);
        System.out.println(r);
    }
}
*/
/*class Design
{
    public void register()
    {
        System.out.println("Please Register to Login");
    }
    public String pay(int payment)
    {
        if(payment<=20)
           return "Paid";
        return "boom!!!";
    }
}
public class ClassObjects
{
    public static void main(String[] args)
    {
        Design d=new Design();
        d.register();
        String s=d.pay(200);
        System.out.println(s);
    }
}

// Method Overoading (same method name but parameters different)
class Calculator
{
    public int add(int a,int b)
    {
        return a+b;
    }
    public int add(int a,int b,int c)
    {
        return a+b+c;
    }
    public double add(double a,double b)
    {
        return a+b;
    }
}
public class ClassObjects
{
    public static void main(String[] args)
    {
        Calculator cal=new Calculator();
        System.out.println(cal.add(96,69));
        System.out.println(cal.add(2,3,6));
        System.out.println(cal.add(3.7, 2.6));
        
        // Array
        int nums[]={1,2,3,4,5};
        for(int i=0;i<5;i++){
        System.out.println(nums[i]);
        } 
        // Multidimensional Array
        int a[][]=new int[4][4];
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(a[i][j]+"");
            }
            System.out.println();
        }
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                a[i][j]=(int)(Math.random()*10);
            }
        }
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for(int p[]:a)
        {
            for(int m:p)
            {
                System.out.print(m+" ");
            }
            System.out.println();
        }
        // jagged array
        int mp[][]=new int[3][];
        mp[0]=new int[4];
        mp[1]=new int[5];
        mp[2]=new int[2];
        for(int i=0;i<mp.length;i++)
        {
            for(int j=0;j<mp[i].length;j++)
            {
                mp[i][j]=(int)(Math.random()*10);
                System.out.print(mp[i][j]+" ");
            }
            System.out.println();
        }
    }
}
*/
// Array of Objects
class Student
{
    String name,Dept;
    int roll;
    double marks;
    public void show()
    {
        System.out.print(name+ ":"+Dept+":"+roll+":"+marks);
    }
}
public class ClassObjects
{
    public static void main(String[] args)
    {
        Student s1=new Student();
        s1.name="Pinki";
        s1.Dept="CSE";
        s1.roll=96;
        s1.marks=3.53;
        
        Student s2=new Student();
        s2.name="Rinki";
        s2.Dept="Agriculture";
        s2.roll=61;
        s2.marks=3.57;
        
        Student s3=new Student();
        s3.name="Abir";
        s3.Dept="CSE";
        s3.roll=110;
        s3.marks=3.91;
        
        Student s[]=new Student[3];
        s[0]=s1;
        s[1]=s2;
        s[2]=s3;
        
        for(int i=0;i<s.length;i++)
        {
            System.out.println(s[i].name+" "+s[i].Dept+" "+s[i].marks+" "+s[i].roll);
        }
        s1.show();
        // String
        String st=new String("Pinks");
        System.out.println(st.charAt(3));
        System.out.println(st.concat("Baby"));
    }
    
}