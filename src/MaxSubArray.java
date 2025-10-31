public class MaxSubArray {
    public static void main(String[] args) {
        int[] intArray = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("sum::"+ findMaxSubArray(intArray));
    }

    private static int findMaxSubArray(int[] intArray) {
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        for(int num : intArray) {
            sum = Math.max(num, sum + num);
            ans = Math.max(ans, sum);

        }
        return ans;


    }
}
