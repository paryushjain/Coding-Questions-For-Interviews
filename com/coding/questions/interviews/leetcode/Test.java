package com.coding.questions.interviews.leetcode;

public class Test {

	public static void main(String[] args) {
		System.out.println(sumOfNumber(91));
	}

	public static int sumOfNumber(int n) {
		int sum = 0;
		
		while(n >0) {
			sum = sum + n % 10;
			n = n/10;
		}

			return sum;
		
	}
}