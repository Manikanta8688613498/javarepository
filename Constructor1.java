class Student1
{
int id;
String name;
public Student1(int id, String name)
{
this.id=id;
this.name=name;
System.out.println(id+" "+name);
}
public Student1(int a,int b,int c)
{
System.out.println(a+" "+b+" "+c);
}
}
public class Constructor1
{
public static void main(String[] args)
{
Student1 s=new Student1(10,"mani");
Student1 s1=new Student1(11,10,20);
}
}