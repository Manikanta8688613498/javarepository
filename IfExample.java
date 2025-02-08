class IfExample
{
public static void main(String[] args)
{
double amount=10000;
double discount=0.0;
if(amount>=10000)
{
discount=amount*0.25;
}
System.out.println(amount);
System.out.println(discount);
System.out.println("final amount= "+(amount-discount));
}
}