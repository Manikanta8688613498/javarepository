import java.util.*;
class Employee{
int id=1;
String name="Mani";
double salary=20000;
public String toString(){
return "id="+id +", Name="+name +", Salary="+salary;
}
}
public class ToStringExample{
public static void main(String[] args)
{
Integer i=new Integer(10);
System.out.println(i);
ArrayList L=new ArrayList();
L.add("a");
L.add("b");
System.out.println(L);
Employee emp=new Employee();
System.out.println(emp);
String s=new String("Mani");
System.out.println(s);
}
}