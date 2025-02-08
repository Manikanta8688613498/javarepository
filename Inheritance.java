class Animal
{
public void eat()
{
System.out.println("Eating....");
}
}
class Tiger extends Animal
{
public void sleep()
{
System.out.println("Sleeping");
}
}
public class Inheritance
{
public static void main(String[] args)
{
Animal an=new Tiger();
Tiger t=(Tiger)an;
t.sleep();
t.eat();
an.eat();

}
}