package com.coding.questions.interviews.leetcode;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author paryjain
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array
 * 
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
 *
 */
public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		System.out.println(removeDuplicates(new int[] { 1, 1, 2 }));
	}

	public static int removeDuplicates(int[] nums) {
		Set<Integer> numSet = new TreeSet<>();

		for (int num : nums) {
			numSet.add(num);
		}

		Iterator itr = numSet.iterator();
		int i = 0;
		while (itr.hasNext()) {
			nums[i] = (int) itr.next();
			i++;
		}
		return numSet.size();
	}
}
