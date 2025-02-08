import java.io.*;

class Employee implements Serializable
{
   transient final int id = 1;
   transient static String name = "ravi";
   transient double salary = 1000.0;
}

public class SerializationExample
{
   public static void main(String[] args) throws Exception
   {
      FileOutputStream fos = new FileOutputStream("info.txt");
      ObjectOutputStream oos = new ObjectOutputStream(fos);

      Employee emp = new Employee();
      System.out.println(emp.hashCode());
      System.out.println(emp.id + " - " + emp.name + " - " + emp.salary);
      oos.writeObject(emp);
      System.out.println("serialization is completed");

      oos.close();
   }
}