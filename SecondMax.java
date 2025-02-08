

import java.util.*;
public class SecondMax

{
public static void main(String [] args)
{


int a[]={1,6,4,7,8,90,23,44};

int n=a.length;

int max=a[0],max2=0,s=0;

for(int i=0;i<n;i++)
{
          if(a[i]>max2)
{
     //  max2= Math.min(max,a[i]);
       max2= (a[i]<max)?a[i]:max;
      
   max= (a[i]>max)?a[i]:max;
       //max=Math.max(a[i],max);
}
    
}

System.out.println("Second max element is :"+max2);

}

}