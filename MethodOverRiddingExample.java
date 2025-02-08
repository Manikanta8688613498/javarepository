class Parent{
public void property()
{
System.out.println("Car,Gold,House,Fields,Bike");
}
public void study()
{
System.out.println("M.B.A");
}
}
class Child extends Parent{
public void study(){
System.out.println("M.C.A");
}
public void job()
{
System.out.println("Software Developer");
}
}
public class MethodOverRiddingExample{
public static void main(String[] args){
Child c=new Child();
c.study();
Parent p1=new Parent();
p1.study();
c.job();
c.property();
}
}