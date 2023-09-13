// a program to calculate sum of two values 
public class Sum
{
    public static void main(String a[])
    {
        // each object have different memory spaces 
        Arithmetics math = new Arithmetics();
        math.a = 10;
        math.b = 20;
        math.Sum();
        math.Display();
    }
}
public class Arithmetics
{
    int a,b,c;
    void Sum()
    {
        c = a+b;
    }
    void Display()
    {
        System.out.println("sum : "+c);
    }
}