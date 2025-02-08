class Computer{
  String os="windows 11";
  public void operate(){
    System.out.println("operating...");
  }
}
class Factory
{
  public Computer CreateComputer(){
    Computer c=new Computer();
    return c;
  }
}
public class Test2060{
  public static void main(String[] args){
    Factory f=new Factory();
    Computer c=f.CreateComputer();
    System.out.println(c);
    System.out.println(c.os);
    c.operate(); 
 }
}