import java.util.*;
public class NumberToWords
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int number=sc.nextInt();
if(number<0 || number>10000)
{
System.out.println("Invalid Number");
}
else
{
int a=number%10;
int b=number/10;
int c=b%10;
int d=number/100;
int e=d%10;
int f=number/1000;
int g=f%10;
String sd[]={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Ninteen"};
String ty[]={"","Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ningty"};
String h="Hundred";
String th="Thousand";
if(number<20)
System.out.println(sd[number]);
else if(number>19&&number<100)
System.out.println(ty[c]+""+""+sd[a]);
else if(number>99&&number<1000)
System.out.println(sd[e]+""+""+h+""+""+ty[c]+""+""+sd[a]);
else
System.out.println(sd[g]+""+""+th+""+""+sd[e]+h+""+""+ty[c]+sd[a]);
}
}
}