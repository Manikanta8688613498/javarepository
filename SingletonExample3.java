class Cache
{
private static Cache instance;
private static int count;
private Cache()
{
//no-code
}
public synchronized static Cache getInstance()
{
if(count<2)
{
instance=new Cache();
count++;
}
return instance;
}
}
public class SingletonExample3
{
public static void main(String[] args)
{
Cache c1=Cache.getInstance();
Cache c2=Cache.getInstance();
Cache c3=Cache.getInstance();
Cache c4=Cache.getInstance();
System.out.println(c1==c2);
System.out.println(c1.hashCode());
System.out.println(c2.hashCode());
System.out.println(c3.hashCode());
System.out.println(c4.hashCode());
}
}