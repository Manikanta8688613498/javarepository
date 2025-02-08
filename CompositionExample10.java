class Battery
{
int volts;
public Battery(int volts)
{
this.volts=volts;
}
public void recharge()
{
System.out.println("Battery is recharged...");
}
}
class Toy
{
Battery b;
public Toy(Battery b)
{
this.b=b;
}
public void jump()
{
System.out.println(b.volts);
b.recharge();
System.out.println("Toy is jumping...");

}
}
public class CompositionExample10
{
public static void main(String[] args)
{
Battery b=new Battery(1234);
Toy t=new Toy(b);
t.jump();
Integer obj = 10;
System.out.println(obj);
}
}