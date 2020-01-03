package com.coding.questions.interviews.leetcode;

/**
 * @author paryjain 
 *https://leetcode.com/problems/palindrome-number/
 *Determine whether an integer is a palindrome. An integer is a palindrome when
 *it reads the same backward as forward.
 *
 */
public class PalindromeNumber {

	public static boolean isPalindrome(int x) {
		int rev_num = 0;
		int num = x;
		while (num > 0) {
			rev_num = rev_num * 10 + num % 10;
			num = num / 10;
		}

		return rev_num == x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		System.out.println(isPalindrome(-10));

	}

}
