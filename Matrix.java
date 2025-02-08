class Matrix{
public static void main(String[] args){
int a[][]={{1,2,3},{4,5,6}};
int transpose[][]=new int[3][2];
for(int i=0;i<2;i++)
{
for(int j=0;j<3;j++)
{
transpose[j][i]=a[i][j];
}
}
System.out.println("The original matrix is:");
for(int i=0;i<2;i++)
{
for(int j=0;j<3;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println("");
}
System.out.println("The transpose of a given matrix is:");
for(int i=0;i<3;i++)
{
for(int j=0;j<2;j++)
{
System.out.print(transpose[i][j]+" ");
}
System.out.println("");
}
}
}
                                                