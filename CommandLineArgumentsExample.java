class CommandLineArgumentsExample{
public static void main(String[] args){
System.out.println("Length of the args[] is: "+args.length);
int sum=0;
for(int i=0;i<args.length;i++){
System.out.println("args["+i+"]= "+args[i]);
sum=sum+Integer.parseInt(args[i]);
}
System.out.println("The sum of all the elements in an array is: "+sum);
}
}