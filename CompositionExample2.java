class Sim
{
int simNo;
public Sim(int simNo)
{
this.simNo=simNo;
}
public void connect()
{
System.out.println("Connected.....");
}
}
class Mobile
{
Sim s;
public Mobile(Sim s) 
{
 this.s = s;
}
public void call()
{
s.connect();
System.out.println("Calling...");
}
}
public class CompositionExample2
{
public static void main(String[] args)
{
Sim s=new Sim(123);
Mobile m=new Mobile(s);
m.call();
}
}