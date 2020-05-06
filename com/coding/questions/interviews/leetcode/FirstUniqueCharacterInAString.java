package com.coding.questions.interviews.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 * 
 * @author paryjain
 *
 */
public class FirstUniqueCharacterInAString {

	public static void main(String[] args) {
		System.out.println(firstUniqChar("abcdeabcd"));
	}

	public static int firstUniqChar(String s) {

		 Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			if (!map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), i);
			} else {
				map.put(s.charAt(i), -1);
			}
		}

		int min = Integer.MAX_VALUE;
		for(char c : map.keySet()) {
			if(map.get(c) !=-1 && min > map.get(c)) {
				min = map.get(c);
			}
		}
		
		
		return min == Integer.MAX_VALUE ? -1 : min;

	}

}
