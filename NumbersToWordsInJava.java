import java.util.*;
public class NumbersToWordsInJava
{
public static void main(String[] args)
{
int number;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
number=sc.nextInt();
if(number<1 || number>9999)
{
System.out.println("Invalid Number");
}
else{
int a=number%10;//last digit
int b=number/10;//quotient
int c=b%10;//last to second digit
int d=number/100;//quotient
int e=d%10;//last to third digit
int f=number/1000;//quotient
int g=f%10;//first digit
//System.out.println(a);
//System.out.println(c);
//System.out.println(e);
//System.out.println(g);
String sd[]={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Ninteen"};
String ty[]={"","Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
String h="Hundred";
String th="Thousand";
if(number<20)
System.out.println(sd[number]);
else if(number>20&&number<100)
System.out.println(ty[c]+""+sd[a]);
else if(number>100&&number<999)
System.out.println(sd[e]+""+h+""+ty[c]+""+sd[a]);
else
System.out.println(sd[g]+""+th+""+sd[e]+""+h+""+ty[c]+""+sd[a]);
}
}
}