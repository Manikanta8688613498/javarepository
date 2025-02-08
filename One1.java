public interface One
{
void m1();
}
public class LamdaExpressiomExample1
{
public static void main(String[] args)
{
One o=new One()
{
public void m1()
{
System.out.println("Hello iam from m1() method...");
}
};
o.m1();
}
}