import java.io.*;
class DeserialisationExample1
{
public static void main(String[] args) throws Exception
{
FileInputStream fis=new FileInputStream("abc.txt");
ObjectInputStream ois=new ObjectInputStream(fis);
Object o=ois.readObject();
Mani m1=(Mani)o;
System.out.println(m1.hashCode());
System.out.println(m1.id+"-----"+m1.name+"------"+m1.salary);
ois.close();
}
}