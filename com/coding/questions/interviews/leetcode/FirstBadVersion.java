package com.coding.questions.interviews.leetcode;

/**
 * https://leetcode.com/problems/first-bad-version/
 * @author paryjain
 *
 */
public class FirstBadVersion {

	public static void main(String[] args) {

	}

	public int firstBadVersion(int n) {

		int left=1, right=n;
		int mid = 0;
		
		while(left<right) {
			mid = left + (right-left)/2;
			if(isBadVersion(mid)) {
				right = mid;
			}else {
				left = mid + 1;
			}
		}
		return left;
	}
	
	public static boolean isBadVersion(int n) {
		return false;
	}

}
