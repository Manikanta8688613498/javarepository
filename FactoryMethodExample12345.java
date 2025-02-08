class Scooty implements Cloneable
{
int regno=12345;
String model="active 6g";
public void ride()
{
System.out.println("ridding..");
}
public String toString()
{
return regno +" "+model;
}
public Object clone() throws CloneNotSupportedException
{
Object o=super.clone();
return o;
}
}
public class FactoryMethodExample12345
{
public static void main(String[] args) throws Exception
{
Class<?> c=Class.forName("Scooty");
Object o=c.getDeclaredConstructor().newInstance();
Scooty s=(Scooty)o;
System.out.println(s);
System.out.println("Regno = "+s.regno+"------"+"Model = "+s.model);
s.ride();
Scooty s2=(Scooty)s.clone();
System.out.println(s.hashCode());
System.out.println(s2.hashCode());
System.out.println(s2.regno+" "+s2.model);
}
}