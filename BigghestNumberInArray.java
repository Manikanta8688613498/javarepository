import java.util.*;
public class BigghestNumberInArray
{
public static void main(String[] args)
{
int a[]={30,20,60,10,25,15};
int max=a[0];
for(int i=1;i<a.length;i++)
{
if(a[i]>max)
{
max=a[i];
}
}
System.out.println("The Biggest number in an array is:"+max);
}
}