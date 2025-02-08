class Vehicle
{
public void brakes()
{
System.out.println("disc brakes");
}
}
public class AnonymusExample1
{
public static void main(String[] args)
{
Vehicle v=new Vehicle() {
 public void brakes()
{
System.out.println("Hydrolic brakes");
}
};
v.brakes();
}
}
