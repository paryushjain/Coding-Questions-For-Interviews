package com.coding.questions.interviews.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author paryjain
 * https://leetcode.com/problems/single-number/
 *
 */
public class SingleNumber {

	public static int singleNumber(int[] nums) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int num : nums) {
			if (map.containsKey(num)) {
				map.put(num, 2);
			}
			if (!map.containsKey(num)) {
				map.put(num, 1);
			}
		}
		for (int num : nums) {
			if (map.get(num) == 1) {
				return num;
			}
		}

		return 0;
	}

	public static void main(String[] args) {

	}

}
