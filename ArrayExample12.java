class ArrayExample12
{
public static void main(String[] args)
{
int[] a={1,2,3,4,5,6,7,9,10};
int expectedNoOfElements=a.length+1;
int totalSum=(expectedNoOfElements*(expectedNoOfElements+1))/2;
int sum=0;
for(int i=0;i<a.length;i++)
{
sum=sum+a[i];
}
System.out.println("missing number is: "+(totalSum-sum));
}
}