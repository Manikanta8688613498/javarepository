class This
{
public This()
{
this(10);
System.out.println("From zero parameterized constructor");
}
public This(int a)
{
System.out.println("From parameterised constructor");
}
}
public class ThisExample3
{
public static void main(String[] args)
{
This th=new This();
}
}
