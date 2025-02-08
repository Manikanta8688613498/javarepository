interface One
{
void m1(int a,int b);
}
public class LamdaExpressiomExample3
{
public static void main(String[] args)
{
One o=(a,b)->{
System.out.println("a="+a);
System.out.println("b="+b);
};
o.m1(10,20);
}
}