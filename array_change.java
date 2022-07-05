public class array_change {
    public static void main(String[] args) {
        int mat[][]=new int[][]{{1,2,3,5},{9,5,4,10},{6,8,7,12}};
        System.out.println("Before changing:");
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("After exchanging:");
        int arr[][]=new int[mat[0].length][mat.length];
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                arr[j][i]=mat[i][j];
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
