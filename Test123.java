class Bike1
{
    public Bike1(int a){
        System.out.println("parameterized constructor");
    }
public Bike1()
{
System.out.println("Zero parameteerized constructor");
}
static
{
System.out.println("Static block");
}

}
class Test123{
    public static void main(String[] args)
    {
        Bike1 b=new Bike1(10);
        Bike1 b1=new Bike1();

    }
}