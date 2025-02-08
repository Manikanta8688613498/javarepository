import java.util.*;
class DuplicateElements
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("enter count of array elements: ");
int num;
num=sc.nextInt();
int []a=new int[num];
System.out.print("enter array elements : ");
for(int i=0;i<num;i++)
{
 a[i]=sc.nextInt();
}
int temp[]=new int[a.length];
int j=0;
for(int i=0;i<a.length-1;i++)
{
if(a[i]!=a[i+1])
{
temp[j]=a[i];
j=j+1;
}
}
temp[j]=a[a.length-1];
for(int i=0;i<a.length;i++)
{
System.out.print(temp[i]+" ");
}
System.out.println();
}
}
