class Car
{
int carNumber;
String carName;
public Car(int carNumber,String carName)
{
this.carNumber=carNumber;
this.carName=carName;
}
public void start()
{
System.out.println("Car is started...");
} 
}
class  Bike
{
Car c;
public Bike(Car c)
{
this.c=c;
}
public void repair()
{
System.out.println("repairing....");
System.out.println(c.carName);
System.out.println(c.carNumber);

System.out.println("Repairing...");
}
}
public class CompositionExample4{
public static void main(String[] args)
{
Car c=new Car(123,"dezire");
Bike b=new Bike(c);
b.repair();
}
}