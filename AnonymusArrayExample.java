class Work{
public void display(int arr[])
{
int sum=0;
for(int i=0;i<arr.length;i++)
{
sum=sum+arr[i];
}
System.out.println("The sum of the given elements in an array is: "+sum);
}
}
public class AnonymusArrayExample{
public static void main(String[] args){
Work w=new Work();
w.display(new int[]{10,20,30,40,50});
int elements[]={1,2,3,4,5,6};
w.display(elements);
}
}