class ArrayExample10
{
public static void main(String[] args)
{
int[] a={5,3,4,2,5,3,4};
int res=a[0];
for(int i=1;i<a.length;i++)
{
 res=res^a[i];
}
System.out.println("Single repeated element is: "+res);
}
}