package com.coding.questions.interviews.leetcode;

/**
 * https://leetcode.com/problems/jewels-and-stones
 * @author paryjain
 *
 */
public class JewelsAndStones {

	public static void main(String[] args) {
		
		System.out.println(numJewelsInStones("z","ZZ"));

	}

	public static int numJewelsInStones(String J, String S) {
		int count = 0;
		char x[] = J.toCharArray();
		char y[] = S.toCharArray();
		for (char i : x) {
			for (char j : y) {
				if (i == j) {
					count++;
				}
			}
		}
		return count;
	}

}
