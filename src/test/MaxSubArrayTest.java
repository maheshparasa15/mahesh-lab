package test;

public class MaxSubArrayTest {
    public static void main(String[] args) {
        int[] intArray = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(findMaxArray(intArray));
    }

    private static int findMaxArray(int[] intArray) {
        int sum =0;
        int calc = Integer.MIN_VALUE;
        for (int num : intArray) {
            sum = Math.max(num, sum+num);
            calc = Math.max(calc, sum);
        }
        return calc;
    }

}
