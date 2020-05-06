package com.coding.questions.interviews.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/majority-element/
 * 
 * @author paryjain
 *
 */
public class MajorityElement {

	public static void main(String[] args) {
		System.out.println(majorityElement(new int[] { 2,2,1,1,1,2,2,1,1}));
	}

	public static int majorityElement(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int n : nums) {
			if (map.containsKey(n)) {
				map.put(n, map.get(n) + 1);
			} else {
				map.put(n, 1);
			}
		}

		int majority = nums.length / 2;
		for (int n : map.keySet()) {
			if (map.get(n) > majority) {
				return n;
			}
		}

		return 0;
	}
}
