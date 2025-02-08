import java.util.*;
public class ForLoopExample2
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int num=sc.nextInt();
Boolean flag=true;
for(int i=2;i<num;i++)
{
if(num%i==0)
{
flag=false;
break;
}
}
if(flag=false)
{
System.out.println("is prime");
}
else
System.out.println("not a prime");
}
}
