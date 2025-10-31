import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
//https://walkccc.me/LeetCode/problems/1/
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] finalResult = twoSum(nums, target);
        Arrays.stream(finalResult).forEach(System.out::println);
    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();

        for( int i =0; i<nums.length; i++) {
            if(numToIndex.containsKey(target - nums[i]))
                return new int[] {numToIndex.get(target - nums[i]), i};
            numToIndex.put(nums[i], i);
        }
        return new int[]{};
    }


}
