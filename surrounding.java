public class surrounding {
    public static void main(String[] args) {
        int arr[][]=new int[4][5];
        arr[0]=new int[]{0,1,0,1,0};
        arr[1]=new int[]{1,1,0,0,1};
        arr[2]=new int[]{0,1,1,0,0};
        arr[3]=new int[]{1,0,1,0,1};
        System.out.println("Array before:");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int n=0,m=0;
        /* 1 0 0
         * 1   0
         * 0 1 0
          */
        System.out.println("Boundary elements are:");
        for(int i=0;i<=arr.length;i++)
        {
            for(int j=0;j<=arr[i].length;j++)
            {
                if(i==n&&j==m)
                {
                    System.out.print("  ");
                    continue;
                }
                if((i==n||i==n-1||i==n+1)&&(j==m||j==m-1||j==m+1))
                    System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
