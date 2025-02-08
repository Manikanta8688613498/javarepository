import java.util.*;
class StudentGradeMarks {
    public static void main(String[] args) {
        System.out.println("Enter the subject marks:");
        Scanner sc=new Scanner(System.in);
        int a[] =new int[6];
        int total=0;
        for(int i=0;i<a.length;i++)
        {
            System.out.print("subject "+(i+1)+" marks=");
            a[i]=sc.nextInt();
            if (a[i] < 0 || a[i] > 100) {
                System.out.println("Invalid marks! Please enter marks between 0 and 100.");
                return;
              }
        }
        for(int i=0;i<a.length;i++)
        {
            total=total+a[i];
        }
        System.out.println("Total marks : "+total);
        int averageMarks=(total/a.length);
        System.out.println("the average marks : "+averageMarks);
        if(averageMarks>=90&&averageMarks<=100)
        {
            System.out.println("A grade");
        }
        else if(averageMarks>=70&&averageMarks<=89)
        {
            System.out.println("B grade");
        }
        else if(averageMarks>=60&&averageMarks<69)
        {
            System.out.println("C grade");
        }
        else if(averageMarks>=40&&averageMarks<59)
        {
            System.out.println("D grade");
        }
        else if(averageMarks>0&&averageMarks<=39)
        {
            System.out.println("Fail");
        }
    }
}