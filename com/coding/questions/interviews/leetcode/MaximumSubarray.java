package com.coding.questions.interviews.leetcode;

public class MaximumSubarray {

	public static void main(String[] args) {
		System.out.println(maxSubArray(new int[] { -2,1,-3,4,-1,2,1,-5,4 }));

	}

	public static int maxSubArray(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (sum < sum + nums[i]) {
				sum += nums[i];
			}else {
				sum =0;
			}
		}

		return sum;
	}

}
