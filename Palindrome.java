import java.util.*;
public class Palindrome
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int number=sc.nextInt();
int reverse=0,remainder;
int originalnumber=number;
while(number!=0)
{
remainder=number%10;
reverse=reverse*10+remainder;
number=number/10;
}
if(originalnumber==reverse)
{
System.out.println(originalnumber + " number is a palindrome");
}
else
System.out.println(originalnumber + " number is not a palindrome");
}
}