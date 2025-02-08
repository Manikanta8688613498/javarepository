import java.util.*;
class ArrayExample11
{
public static void main(String[] args)
{
int[] a={8,5,10,12,3,1,4};
ArrayList<Integer> al1=new ArrayList<>();
ArrayList<Integer> al2=new ArrayList<>();
for(int i=0;i<a.length;i++)
{
if(a[i]%2==0)
{
al1.add(a[i]);
}
else
{
al2.add(a[i]);
}
}
int total1=0;
for(int i:al1)
{
total1=total1+i;
System.out.println(i+" ");
}
System.out.println("The sum of even numbers in an array is: "+total1);
System.out.println("The number of even numbers: "+al1.size());
int total2=0;
for(int i:al2)
{
total2=total2+i;
System.out.println(i+" ");
}
System.out.println("The sum of even numbers in an array is: "+total2);
System.out.println("The number of even numbers: "+al2.size());
}
}