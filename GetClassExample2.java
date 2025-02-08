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
System.out.println(emp.getClass());

}
}