class Caluculator
{
public int add(int a,int b)
{
return a+b;
}
}
public class Category5
{
public static void main(String[] args)
{
Caluculator cal=new Caluculator();
int sum=cal.add(100,200);
System.out.println("The sum of a and b is:"+sum);
}
}