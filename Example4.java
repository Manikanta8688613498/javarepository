import java.util.*;
public class Example4
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int number=sc.nextInt();
int reverse=0,remainder;
int originalnumber=number;
while(number>0)
{
remainder=number%10;
reverse=reverse*10+remainder;//reverse=6
number=number/10;//number=12345
}
System.out.println("given number= " +originalnumber+ " Reverse number=" +reverse);
}
}