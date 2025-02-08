public class ForLoop
{
public static void main(String[] args)
{
 int sum=0;
for(int i=1;i<=100;i++)
{
if(i%2!=0)
{
sum=sum+i;
}
}
System.out.println("the sum of all odd numbers from 1 to 100 is:" +sum);

}
}
