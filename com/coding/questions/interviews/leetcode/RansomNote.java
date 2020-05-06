package com.coding.questions.interviews.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/ransom-note/
 * 
 * @author paryjain
 *
 */
public class RansomNote {

	public static void main(String[] args) {
		System.out.println(canConstruct("aa", "aab"));
	}

	public static boolean canConstruct(String ransomNote, String magazine) {
		Map<Character, Integer> a = new HashMap<>();
		char []x = ransomNote.toCharArray();
		char []y = magazine.toCharArray();
		
		for(char i : y) {
			if(a.containsKey(i)) {
				a.put(i, a.get(i)+1);
			}else {
				a.put(i, 1);
			}
			
		}
		for(char i : x) {
			if(a.containsKey(i) && a.get(i)>0) {
				a.put(i, a.get(i)-1);
			}else {
				return false;
			}
		}

		return true;

	}

}
