class This
{
public void methodOne()
{
System.out.println("From methodone");
}
public void methodTwo()
{
this.methodOne();
System.out.println("From method Two");
}
}
public class ThisExample1
{
public static void main(String[] args)
{
This th=new This();
th.methodTwo();
}
}