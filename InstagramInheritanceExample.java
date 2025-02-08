class P
{
int a=30;
}
class Q extends P
{
int a=50;
}
class InstagramInheritanceExample
{
public static void main(String[] args)
{
P p=new Q();
System.out.println(p.a);
}
}