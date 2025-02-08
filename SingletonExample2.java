class Student
{
private static Student instance;
private Student()
{
//no code
}
public synchronized static Student getInstance()
{
if(instance==null)
{
instance=new Student();
}
return instance;
}
}
public class SingletonExample2
{
public static void main(String[] args)
{
Student s1=Student.getInstance();
Student s2=Student.getInstance();
System.out.println("s1==s2 is "+(s1==s2));
System.out.println(s1.hashCode());
System.out.println(s2.hashCode());
System.out.println(s1);
}
}