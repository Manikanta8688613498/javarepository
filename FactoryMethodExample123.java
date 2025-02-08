class Scooty
{
int regno=12345;
String model="active 6g";
public void ride()
{
System.out.println("ridding..");
}
}
class ScootyFactory
{
public Scooty scootyFactoryMethod()
{
Scooty s=new Scooty();
return s;
}
}
public class FactoryMethodExample123
{
public static void main(String[] args)
{
ScootyFactory sf=new ScootyFactory();
Scooty s=sf.scootyFactoryMethod();
System.out.println(s);
System.out.println("Regno = "+s.regno+"------"+"Model = "+s.model);
s.ride();
}
}