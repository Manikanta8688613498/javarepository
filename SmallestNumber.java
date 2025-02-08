import java.util.Arrays;
public class SmallestNumber
{
public static void main(String[] args)
{
int a[]={100,400,200,600,300};
int min=a[0];
for(int i=1;i<=4;i++)
{
if(a[i]<min)
{
min=a[i];
}
}
System.out.println("The smallest number in array is:"+min);
}
}