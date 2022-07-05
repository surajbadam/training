public class array_direction {
    public static void main(String[] args) {
        int arr[][]=new int[][]{{1,2,3,4,5},{6,7,8,9,0},{1,2,3,4,7},{8,9,1,4,5}};
        check(arr,0,0);
    }
    static void check(int arr[][],int st,int end)
    {
        int count=0;
        try {
            int num = arr[st - 1][end];
            count++;
        } catch (Exception e) {
        
        }
        
        try {
            int num = arr[st][end - 1];
            count++;
        } catch (Exception e) {
        
        }
        
        try {
            int num = arr[st + 1][end];
            count++;
        } catch (Exception e) {
        
        }
        
        try {
            int num = arr[st][end + 1];
            count++;
        } catch (Exception e) {
        
        } finally {
            System.out.println(count);
        }
    }
}
