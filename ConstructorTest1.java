class Student
{
int id;
String name;
String gender;
double fee;
public Student(int id,String name,String gender,double fee)
{
this.id=id;
this.name=name;
this.gender=gender;
this.fee=fee;
System.out.println("Parameterized constructor is called...");
}
public Student(int id,String gender,double fee,String name)
{
this.id=id;
this.gender=gender;
this.fee=fee;
this.name=name;
System.out.println("Second parameterized constructor is called:");
}
public void display()
{
System.out.println("Student details are: "+"id= "+id+" "+"Name= "+name+" "+"gender= "+gender+" "+"Fee= "+fee);
}
}
public class ConstructorTest1{
public static void main(String[] args){
Student s1=new Student(10,"Sai","Male",20000);
Student s2=new Student(10,"Male",20000,"Sai");

s1.display();
s2.display();
}
}