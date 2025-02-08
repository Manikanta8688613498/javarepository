class Matrix123 {
public static void main(String[] args) {
int[][] matrix = {{1, 2, 3},{4, 5, 6}};
int[][] transposedMatrix = new int[3][2];
for (int i=0;i<2;i++) {
for (int j=0;j<3;j++) {
transposedMatrix[j][i] = matrix[i][j];
}
}
System.out.println("Original Matrix:");
for (int i= 0;i<2;i++) {
for (int j= 0;j<3;j++) {
System.out.print(matrix[i][j] + " ");
}
System.out.println();
}
System.out.println("Transposed Matrix:");
for (int i = 0;i< 3;i++) {
for (int j = 0;j< 2;j++) {
System.out.print(transposedMatrix[i][j] + " ");
}
System.out.println();
}
}
}
