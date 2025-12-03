package PracticePrograms;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumTest {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println();
        int[] twoSums = twoSum(nums, target);
        Arrays.stream(twoSums).forEach(System.out::println);

    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numToIndex = new HashMap<>();

        for(int i=0; i< nums.length; i++) {
            if(numToIndex.containsKey(target - nums[i]))
                return new int[] {numToIndex.get(target-nums[i]), i};
            numToIndex.put(nums[i], i);
        }
        return new int[]{};



        //        Map<Integer, Integer> numToIndex = new HashMap<>();
//        for(int i =0; i<nums.length;i++) {
//            if (numToIndex.containsKey(target - nums[i])) {
//                return new int[]{numToIndex.get(target - nums[i]), i};
//            }
//
//            numToIndex.put(nums[i], i);
//        }
//        return new int[]{};

    }
//        Map<Integer, Integer> numToIndex = new HashMap<>();
//
//        for (int i = 0; i < nums.length; ++i) {
//            if (numToIndex.containsKey(target - nums[i]))
//                return new int[] {numToIndex.get(target - nums[i]), i};
//            numToIndex.put(nums[i], i);
//        }
//
//        throw new IllegalArgumentException();
//    }
}
