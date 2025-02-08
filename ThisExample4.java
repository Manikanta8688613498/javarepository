class One
{
public void methodOne()
{
System.out.println("From method one");
Two t=new Two();
t.methodTwo(this);
}
}
class Two
{
public void methodTwo(One o)
{
System.out.println("From methodTwo");
}
}
public class ThisExample4
{
public static void main(String[] args)
{
One o=new One();
o.methodOne();
}
}