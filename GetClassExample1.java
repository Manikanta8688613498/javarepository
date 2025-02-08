import java.lang.reflect.*;
public class GetClassExample1
{
public static void main(String[] args)
{
Object o=new String("Mani");
Class c=o.getClass();
System.out.println(c);
Method[] m=c.getDeclaredMethods();
int count=0;
for(Method m1:m)
{
count++;
System.out.println(m1.getName());
}
System.out.println(count);
}
}