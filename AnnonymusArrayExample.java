class AnnonymusArrayExample
{
public static void main(String[] args)
{
 AnnonymusArrayExample.method1(new int[]{10,20,30,40});
}
public static void method1(int[] no)
{
int total=0;
for(int i:no)
{
total=total+i;
}
System.out.println("Sum of elements: "+total);
}
}