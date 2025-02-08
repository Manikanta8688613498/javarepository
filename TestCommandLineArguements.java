public class TestCommandLineArguements{
public static void main(String[] args){
int n=args.length;
System.out.println("n= "+n);
int c=0;
for(int i=0;i<n;i++){
System.out.println("args[" +i+"] = "+args[i]);
c = Integer.parseInt(args[i]) + c;
}
System.out.println("Sum of numbers = "+c);

}
}