
class Vehicle
{
public void brakes()
{
System.out.println("disc brakes");
}
}
public class AnonymusExample2
{
public static void main(String[] args)
{
new Vehicle() {
public void brakes()
{
System.out.println("Hydrolic brakes");
}
}.brakes();
}
}
