class Test{
int i;
public Test(int i)
{
this.i=i;
}
public String toString()
{
return i+"";
}
public int hashCode()
{
return i;
}
}
public class HashCodeExample{
public static void main(String[] args){
Test t=new Test(1000);
System.out.println(t);
}
}
