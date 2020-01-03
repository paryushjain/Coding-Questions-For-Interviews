package com.coding.questions.interviews.leetcode;

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[] { 2, 7, 11, 15 };
		twoSum(a, 9);

	}

}
