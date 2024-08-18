@FunctionalInterface
interface A
{
    void show();
}
public class LambdaExpression {
    public static void main(String[] args)
    {
        A obj= ()-> System.out.println("A.show()");
        obj.show();
    }
}
