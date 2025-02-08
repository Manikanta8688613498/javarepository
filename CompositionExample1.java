class Engine{
    int engineNo=123;
    public void start()
    {
        System.out.println("Engine Started");
    }
}
class Car{
    Engine en;
    public void drive()
    {
        en=new Engine();
        en.start();
        System.out.println("Driving the car");
        System.out.println(en.engineNo);
    }
}
public class CompositionExample1{
    public static void main(String[] args){
        Car c=new Car();
        c.drive();
    }
}