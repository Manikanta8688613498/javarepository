import java.util.*;
class StringExample2
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a String :");
String str1=sc.nextLine();
StringBuffer sb=new StringBuffer(str1);
sb.reverse();
StringBuffer result=new StringBuffer();
for(int i=0;i<sb.length();i++)
{
result.append(sb.charAt(i));
if(i<sb.length()-1)
{
result.append("-");
}
}
System.out.println("The output is: "+result);
}
}