import java.io.*;

public class DeserializationExample
{
   public static void main(String[] args) throws Exception
   {
      FileInputStream fis = new FileInputStream("info.txt");
      ObjectInputStream ois = new ObjectInputStream(fis);

      Object o = ois.readObject();
      Employee e = (Employee)o;
      System.out.println(e.hashCode());
      System.out.println(e.id + " -  " + e.name + " - " + e.salary);
      
      ois.close();
   }
}