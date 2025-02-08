class Student
{
private int id;
private String name;
private double fee;
public Student(int id,String name,double fee)
{
this.id=id;
this.name=name;
this.fee=fee;
}
public void one()
{
System.out.println("Parameterized constructor is called");
System.out.println("id="+this.id);
System.out.println("Name="+this.name);
System.out.println("Fee="+fee);
}
public Student(int id,double fee,String name)
{
this.id=id;
this.fee=fee;
this.name=name;
}
public void two()
{
System.out.println("Parameterized constructor is called");
System.out.println("id="+this.id);
System.out.println("Fee="+this.fee);
System.out.println("Name="+this.name);
}
}
public class Students
{
public static void main(String[] args)
{
Student std=new Student(100,"Manikanta",30000.0);
Student std2=new Student(100,25000.0,"Balu");
std.one();
std2.two();
}
}