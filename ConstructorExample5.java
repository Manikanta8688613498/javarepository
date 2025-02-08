class Student
{
int sno;
String name;
double fee;
public Student(int sno,String name,double fee)
{
this.sno=sno;
this.name=name;
this.fee=fee;
System.out.println("Parameterized constructor is called...");
}
public Student(String name,double fee,int sno)
{
this.name=name;
this.fee=fee;
this.sno=sno;
System.out.println("Parameterized constructor is called...");
}
public void display()
{
System.out.println("Student roll number :"+sno+", Name: "+name+ ", Fee: "+fee);
}
}
class ConstructorExample5
{
public static void main(String[] args)
{
Student s1=new Student(1,"Sai",10000.0);
Student s2=new Student("Saikumar",10000.0,2);
s1.display();
s2.display();


}
}