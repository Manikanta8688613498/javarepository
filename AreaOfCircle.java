 import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Radius:");
double radius=sc.nextDouble();
System.out.println("Area of circle is:"+(Math.PI * (radius*radius))
);
System.out.println("perimeter of a circle is:"+(2 * Math.PI * radius)
);
}
}