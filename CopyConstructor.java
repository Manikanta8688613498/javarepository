class Student
{
int id;
String name;
public Student(int id,String name)
{
this.id=id;
this.name=name;
System.out.println(id+" "+name);
}
public Student(Student s)
{
id=s.id;
name=s.name;
System.out.println(id+" "+name);
}
}
public class CopyConstructor
{
public static void main(String[] args)
{
Student s1=new Student(10,"Mani");
Student s2=new Student(s1);
}
}
