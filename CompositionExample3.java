class Car
{
int carNumber=123;
String carName="shift";
public void start()
{
System.out.println("Car started...");
}
public String toString()
 {
  return "Car [carNumber=" + carNumber + ", carName=" + carName + "]";
 }
}
class Bike
{
Car c;
public void repair()
{
c=new Car();
System.out.println(c);
System.out.println(c.carNumber);
System.out.println(c.carName);
c.start();
System.out.println("Bike is repaired....");
}
}
public class CompositionExample3{
public static void main(String[] args){
Bike b=new Bike();
b.repair();
}
}