class COne
{
public void methodOne(CTwo c2)
{
System.out.println("From method one...");
}
}
class CTwo
{
public void methodTwo()
{
System.out.println("From method two...");
COne c=new COne();
c.methodOne(this);
}
}
public class ThisExample1234
{
public static void main(String[] args)
{
CTwo ct=new CTwo();
ct.methodTwo();
}
}