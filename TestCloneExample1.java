class Student implements Cloneable
{
int sno=1;
String sname="john";
double fee=1000.0;
public Object clone() throws CloneNotSupportedException
{
Object o=super.clone();
return o;
}
}
public class TestCloneExample1
{
public static void main(String[] args) throws CloneNotSupportedException
{
Student s1=new Student();
Object o=s1.clone();
Student s2=(Student)o;
System.out.println(s1==s2);
}
}
