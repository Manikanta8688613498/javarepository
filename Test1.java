class Car
{
int regno=123;
public void drive()
{
System.out.println("Driving");
}
}
class CarFactory
{
public Car CreateCar()
{
Car c=new Car();
return c;
}
}
public class Test1
{
public static void main(String[] args)
{
CarFactory cf=new CarFactory();
Car c= cf.CreateCar();
System.out.println(c);
c.drive();
System.out.println(c.regno);
}
}