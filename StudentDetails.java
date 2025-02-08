import java.io.*;
class StudentDetails
{
public static void main(String[] args) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter sno = ");
int sno=Integer.parseInt(br.readLine());
System.out.print("Enter sname = ");
String sname=br.readLine();
System.out.print("Enter gender = ");
char gender = (char) br.read();
br.readLine(); 
System.out.print("Enter fee = ");
double fee=Double.parseDouble(br.readLine());
System.out.println("The Student information is :");
System.out.println("sno = "+sno);
System.out.println("sname = "+sname);
System.out.println("gender = "+gender);
System.out.println("fee = "+fee);
}
}