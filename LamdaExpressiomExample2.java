interface One
{
void m1(int a);
}
public class LamdaExpressiomExample2
{
public static void main(String[] args)
{
One o=a->System.out.println(a);
o.m1(10);
}
}