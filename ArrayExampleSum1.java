import java.util.*;
class ArrayExampleSum1
{
public static void main(String[] args)
{
int sum=0;
int a[]=new int[5];
System.out.println("Enter array elements ");
Scanner sc=new Scanner(System.in);
for(int i=0;i<a.length;i++)
{
System.out.print("a["+i+"] = ");
a[i]=sc.nextInt();
}
for(int i=0;i<a.length;i++)
{
sum=sum+a[i];
}
System.out.println("The sum of all the elements of 1d array is : "+sum);
}
}