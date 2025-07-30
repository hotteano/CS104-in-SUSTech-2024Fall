public class E2 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5}};
        triple(arr[0], 2);
        triple(arr[1], 1);
        for(int[] nums:arr)
        {
            for(int num:nums)
            {
                System.out.print(num+" ");
            }
        }
    }
    public static void triple(int[] x, int i) {
        x[i] = x[i-1] * 3;
    }
}


