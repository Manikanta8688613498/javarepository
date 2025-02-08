class First
{
int i=10;
public void methodOne()
{
System.out.println("From methodOne.");
}
class Second
{
int j=20;
public void methodTwo()
{
System.out.println("From methodTwo.");
System.out.println("j = "+j);
System.out.println("i = "+i);
methodOne();
}
}
}
public class MemberInnerClassExample1
{
public static void main(String[] args)
{
First f=new First();
First.Second s=f.new Second();
s.methodTwo();
}
}