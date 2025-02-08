class Employee implements Cloneable
{
String name="Mani";
int id=101;
int salary=10000;
public Object clone() throws CloneNotSupportedException
{
Object o=super.clone();
return o;
}
}
public class CloneMethodExample
{
public static void main(String[] args) throws CloneNotSupportedException
{
Employee emp=new Employee();
Object o=emp.clone();
Employee emp2=(Employee)o;
System.out.println(emp==emp2);
System.out.println(emp.name+" "+emp.id+" "+emp.salary);
System.out.println(emp2.name+" "+emp2.id+" "+emp2.salary);
emp2.name = "Pavan";
emp2.id = 102;
emp2.salary = 20000;
System.out.println(emp2.name + " " + emp2.id + " " + emp2.salary);
}
}