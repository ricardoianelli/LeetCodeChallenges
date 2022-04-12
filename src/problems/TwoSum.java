package problems;

import java.util.HashMap;
import java.util.Map;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Src: https://leetcode.com/problems/two-sum/
*/
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexesMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer diffIndex = indexesMap.get(target - nums[i]);
            if (diffIndex != null) {
                return new int[] {diffIndex, i};
            }

            indexesMap.put(nums[i], i);
        }

        return null;
    }
}
