class Employee
{
int id=10;
String name="Mani";
public void work()
{
System.out.println("Working...");
}
}
public class GetClassExample2
{
public static void main(String[] args)
{
Employee emp=new Employee();
Class c=emp.getClass();
System.out.println(c);
String str=c.getName();
System.out.println(str);
}
}