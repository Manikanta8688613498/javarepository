class One
{
public One()
{
this(10);
System.out.println("Zero parameterized constructor");
}
public One(int i)
{
System.out.println("Parameterized constructor");
}
}
public class ThisKewword{
public static void main(String[] args)
{
One obj=new One();
}
}