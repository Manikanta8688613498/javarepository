class Cache
{
private static Cache instance;
private Cache()
{
//no-code
}
static
{
instance=new Cache();
}
public static Cache getInstance()
{
return instance;
}
}
public class SingletonExample4
{
public static void main(String[] args)
{
Cache c1=Cache.getInstance();
Cache c2=Cache.getInstance();
System.out.println(c1==c2);
System.out.println(c1.hashCode());
System.out.println(c2.hashCode());
}
}
