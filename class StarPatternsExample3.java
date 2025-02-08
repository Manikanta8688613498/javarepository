class StarPatternsExample3 {
    public static void main(String[] args) {
        for(int i=4;i>=1;i--)
        {
            for(int j=4;j<=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println("Try programiz.pro");
    }
}