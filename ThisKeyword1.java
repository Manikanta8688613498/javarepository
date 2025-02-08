class COne
{
public void methodOne(CTwo c2)
{
System.out.println("From method one");
}
}
class CTwo
{
public void methodTwo()
{
COne c=new COne();
c.methodOne(this);
System.out.println("From method two");
}
}
public class ThisKeyword1
{
public static void main(String[] args)
{
CTwo c=new CTwo();
c.methodTwo();
}
}