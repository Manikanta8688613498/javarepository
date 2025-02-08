class Battery
{
int volts=1234;
public void recharge()
{
System.out.println("Battery is recharged...");
}
}
class Toy
{
Battery b;
public void jump()
{
b=new Battery();
System.out.println(b.volts);
b.recharge();
System.out.println("Toy is jumping...");
}
}
public class CompositionExample11
{
public static void main(String[] args)
{
Toy t=new Toy();
t.jump();
}
}