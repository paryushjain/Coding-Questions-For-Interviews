package com.coding.questions.interviews.leetcode;

/**
 * @author paryjain
 * https://leetcode.com/problems/happy-number
 *
 */
public class HappyNumber {

	public static void main(String[] args) {
		System.out.println(isHappy(19));
	}

	public static boolean isHappy(int n) {
		if (n == 1) {
			return true;
		} else if (n < 1) {
			return false;
		}
		int ss = squareAndSum(n);

		while (ss > 9) {
			ss = squareAndSum(ss);
		}

		if (ss == 1 || ss == 7) {
			return true;
		} else if (ss <= 9) {
			return false;
		}

		return false;
	}

	public static int squareAndSum(int n) {
		int sum = 0;

		while (n != 0) {
			int rem = n % 10;
			n /= 10;
			sum = sum + (int) (Math.pow(rem, 2));
		}

		return sum;
	}

}
