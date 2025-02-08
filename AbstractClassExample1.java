abstract class One
{
public void m1()
{
System.out.println("Hello iam from m1 method...");
}
public abstract void m2();
}
class Two extends One
{
public void m2()
{
System.out.println("Hello iam from m2 method...");
}
}
class AbstractClassExample1
{
public static void main(String[] args)
{
Two t=new Two();
t.m1();
t.m2();
}
}