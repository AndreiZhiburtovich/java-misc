// 1. Two Sum
// Easy
// 44.9K
// 1.5K
// Companies
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.
// Example 1:
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:
// Input: nums = [3,2,4], target = 6
// Output: [1,2]
// Example 3:
// Input: nums = [3,3], target = 6
// Output: [0,1]

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] nums = {1, 3, 5, 6, 4, 2, 2};
        System.out.println(Arrays.toString(twoSum(nums, 5)));
        System.out.println(Arrays.toString(twoSum1(nums, 5)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            System.out.println(target + " - " + nums[i] + " = " + difference);
            if (map.containsKey(difference)) {
                result[0] = i;
                result[1] = map.get(difference);
                //System.out.println(result[1]);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }

    public static int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}