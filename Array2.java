class Array2
{
public static void main(String[] args)
{
int[] arr={1,2,3,4,5,6,7,8,9,10};
int sum=10;
for (int i = 0; i < arr.length/2; i++) {
for (int j = 0; j < arr.length; j++) {
if (arr[i]+arr[j]==sum)
System.out.println("Pair ("+arr[i]+" , "+arr[j]+")");
}
}
}
}