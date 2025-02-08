import java.io.*;
class Mani implements Serializable
{
int id=1;
transient String name="Mani";
double salary=10000.0;
}
public class SerialisationExample1
{
public static void main(String[] args) throws Exception
{
FileOutputStream fos=new FileOutputStream("abc.txt");
ObjectOutputStream oos=new ObjectOutputStream(fos);
Mani m=new Mani();
oos.writeObject(m);
System.out.println("Serialisation is completed");
System.out.println(m.hashCode());

oos.close();
}
}