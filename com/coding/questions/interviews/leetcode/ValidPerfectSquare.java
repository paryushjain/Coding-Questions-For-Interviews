package com.coding.questions.interviews.leetcode;

public class ValidPerfectSquare {

	public static void main(String[] args) {
		System.out.println(isPerfectSquare(9));
	}

	public static boolean isPerfectSquare(int num) {
		for (long i = 1; i * i <= num; i++) {

			if ((i) * (i) == num) {
				return true;
			}
		}
		return false;
	}

}
