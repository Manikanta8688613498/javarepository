class Car
{
int engNO=123;
public void m1()
{
System.out.println("Iam from method one");
}
}
class CarFactory{
public static Car m2()
{
Car c=new Car();
return c;
}
}
public class FactoryExample1
{
public static void main(String[] args)
{
Car c=CarFactory.m2();
System.out.println(c);
System.out.println(c.engNO);
c.m1();
}
}