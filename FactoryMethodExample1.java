class Car
{
int carNumber;
String carName;
public Car(int carNumber,String carName)
{
this.carName=carName;
this.carNumber=carNumber;
}
public void repair()
{
System.out.println("Car is repaired");
}
public String toString()
{
return "CarNumber ="+carNumber+" ,CarName="+carName;
}
}
class CarFactory
{
public Car createCar()
{
Car c=new Car(123,"Shift");
return c;
}
}
public class FactoryMethodExample1
{
public static void main(String[] args)
{
CarFactory cf=new CarFactory();
Car c=cf.createCar();
System.out.println(c);
System.out.println(c.carNumber);
System.out.println(c.carName);
}
}