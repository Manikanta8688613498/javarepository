import java.util.*;
public class DuplicateElementsInArray
{
public static void main(String[] args)
{
String arr[]={"Java","C","Python","Java","C++","C++"};
Boolean flag=false;
for(int i=0;i<arr.length;i++)
{
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]==arr[j])
{
System.out.println("The duplicate values in an array is:"+arr[i]);
flag=true;
}
}
}
if(flag==false)
System.out.println("The duplicate value not found");
}
}