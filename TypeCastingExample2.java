class Animal
{
   public void eat() {
      System.out.println("eating..");
   }
}

class Dog extends Animal
{
   public void bark() {
      System.out.println("barking..");
   }
}
  
public class TypeCastingExample2
{
   public static void main(String[] args)
   {
      Animal an = new Dog();
      Dog d = (Dog)an;
      d.bark();
      d.eat();
   }
}