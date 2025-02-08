class OuterExample
{
class Inner
{
public void m1()
{
System.out.println("From inner class method m1");
}
}
public static void main(String[] args)
{
/*OuterExample o=new OuterExample();
OuterExample.Inner i=o.new Inner();
i.m1();
*/
new OuterExample().new Inner().m1();
}
}