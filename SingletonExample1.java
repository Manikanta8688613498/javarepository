class Processor
{
private static Processor instance;
private Processor()
{
//No-code
}
public synchronized static Processor getInstance()
{
if(instance==null)
{
instance=new Processor();
}
return instance;
}
}
public class SingletonExample1
{
public static void main(String[] args)
{
Processor p1=Processor.getInstance();
Processor p2=Processor.getInstance();
System.out.println("p1=p2 is: "+(p1==p2));
System.out.println(p1.hashCode());
System.out.println(p2.hashCode());
}
}
