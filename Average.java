import java.util.Scanner;
public class Average
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first input:");
int a=sc.nextInt();
System.out.println("Enter the second input:");
int b=sc.nextInt();
System.out.println("Enter the third input:");
int c=sc.nextInt();
System.out.println("Enter the fourth input:");
int d=sc.nextInt();
System.out.println("Enter the fifth input:");
int e=sc.nextInt();
System.out.println("The average of given numbers is :");
System.out.println("-----------------------------------");
System.out.println(((a+b+c+d+e)/5));
}
}