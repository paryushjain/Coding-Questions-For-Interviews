package com.coding.questions.interviews.leetcode;

import java.util.Arrays;

public class ValidAnagram {

	public static void main(String[] args) {
		System.out.println(isAnagram("anagram","nagaram"));

	}

	public static boolean isAnagram(String s, String t) {
		
		char []x = s.toCharArray();
		char []y = t.toCharArray();
		
		Arrays.sort(x);
		Arrays.sort(y);
		
		
		s = x.toString();
		t = y.toString();
		
		System.out.println(s + ""+ t);
		
		boolean k = s.equals(t) ? true : false;
		return k;
		
		

	}

}
