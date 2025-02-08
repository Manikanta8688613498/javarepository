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
class Three
{
public void m3(One o)
{
System.out.println("Hello iam from m3 method...");
}
public One m4()
{
One o=new Two();
return o;
}
}
class AbstractClassExample2
{
public static void main(String[] args)
{
Two t=new Two();
t.m1();
t.m2();
Three th=new Three();
th.m3(t);
One o=th.m4();
}
}