interface One
{
void m1();
}
public class LamdaExpressiomExample1
{
public static void main(String[] args)
{
One o=()->System.out.println("Hello iam from m1() method...");
o.m1();
}
}