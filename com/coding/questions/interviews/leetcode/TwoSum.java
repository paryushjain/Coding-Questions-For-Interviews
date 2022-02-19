package com.coding.questions.interviews.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author paryjain 
 * https://leetcode.com/problems/two-sum/
 * Given an array of integers, return indices of the two numbers such that they add up to
 *a specific target. You may assume that each input would have exactly
 *one solution, and you may not use the same element twice.
 *
 */
public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {

		int a[] = new int[2];
		for (int i = 0; i < nums.length; i++) {
			int x = nums[i];
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] == target - x) {
					a[0] = i;
					a[1] = j;
					return a;
				}
			}
		}
		return a;
	}

	public static int[] twoSumOptimised(int[] nums, int target){
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++){
			if(map.containsKey(target-nums[i])){
				return new int[]{map.get(target-nums[i]),i};
			}else {
				map.put(nums[i], i);
			}
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[] { 3,2,8,4 };
		int [] ans = twoSumOptimised(a, 6);
		Arrays.stream(ans).forEach(System.out::println);

	}

}
