class One
{
public One()
{
this(10);
System.out.println("Zero parameterized constructor...");
}
public One(int a)
{
System.out.println("parameterized constructor...");
}
}
public class ThisExample123
{
public static void main(String[] args)
{
One o=new One();
}
}