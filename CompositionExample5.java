class Battery
{
int volts;
public Battery(int volts)
{
this.volts=volts;
}
public void recharge()
{
System.out.println("Recharging...");
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
System.out.println("Jumping...");
b.recharge();
}
}
public class CompositionExample5
{
public static void main(String[] args)
{
Battery b=new Battery(123);
Toy t=new Toy(b);
t.jump();
}
}