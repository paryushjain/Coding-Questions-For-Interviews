package com.coding.questions.interviews.leetcode;

/**
 * @author paryjain
 * https://leetcode.com/problems/longest-common-prefix
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 *
 */
public class LongestCommonPrefix {

	public static void main(String[] args) {
		String s = longestCommonPrefix(new String[] {"c","c"});
		System.out.println(s);
	}

	public static String longestCommonPrefix(String[] strs) {

		if (strs.length == 0) {
			return "";
		}
		int commonPrefix = strs[0].length();

		for (int i = 1; i < strs.length && commonPrefix > 0; i++) {
			if (commonPrefix > strs[i].length()) {
				commonPrefix = strs[i].length();
			}

			for (int j = 0; j < commonPrefix; j++) {
				if (strs[0].charAt(j) != strs[i].charAt(j)) {
					commonPrefix = j;
					break;
				}
			}
		}

		return strs[0].substring(0, commonPrefix);
	}

}
