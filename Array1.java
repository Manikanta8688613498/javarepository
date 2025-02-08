class Array1
{
public static void main(String[] args)
{
int[] arr={1,2,3,4,5};
int sum=0;
for(int i=0;i<arr.length;i++)
{
sum=sum+arr[i];
}
System.out.println("Sum of total array is:"+sum);
if(sum%2==0)
{
System.out.println("The number is even");
}
else
System.out.println("The number is odd");
}
}