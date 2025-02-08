interface One
{
int m1(int a,int b);
}
public class LamdaExpressiomExample4
{
public static void main(String[] args)
{
One o = (a, b) -> (a+b); 
int result=o.m1(10,20);
System.out.println(result);
}
}