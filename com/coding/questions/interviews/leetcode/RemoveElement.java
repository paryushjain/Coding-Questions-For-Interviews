package com.coding.questions.interviews.leetcode;

/**
 * @author paryjain
 * https://leetcode.com/problems/remove-element
 * Given an array nums and a value val, remove all instances of that value in-place and return the new length.
 *
 */
public class RemoveElement {

	public static void main(String[] args) {
		System.out.println(removeElement(new int[] { 3, 2, 2, 3 }, 3));
	}

	public static int removeElement(int[] nums, int val) {
		int i = 0;
		for (int num : nums) {
			if (num != val) {
				nums[i] = num;
				i++;
			}
		}

		return i;
	}
}
