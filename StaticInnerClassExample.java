class StaticInnerClassExample {
    public static void main(String[] args) {
         One oneInstance=new One();
        One.Two t = oneInstance.new Two();
        t.m2();
    }
}
class One
{
    static int i=10;
    public static void m1()
    {
        System.out.println("Hello...");
    }
    class Two
    {
        int i=20;
        public void m2()
        {
            System.out.println("i = "+i);
            m1();
            System.out.println("Hello from static inner class");
        }
    }
}