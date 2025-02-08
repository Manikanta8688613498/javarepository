class This
{
public This()
{
System.out.println("From Zero parameterized constructor");
}
public This(int a)
{
this();
System.out.println("From parameterized constructor");
}
}
public class ThisExample2
{
public static void main(String[] args)
{
This th=new This(10);
}
}
