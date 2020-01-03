package com.coding.questions.interviews.leetcode;

/**
 * @author paryjain
 * https://leetcode.com/problems/reverse-integer
 * Given a 32-bit signed integer, reverse digits of an integer.
 *
 */
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(999999998));

	}

	public static int reverse(int x) {
        long revNum = 0;
        
        while(x !=0){
            revNum = (revNum * 10) + x%10;
            x = x/10;
        }
        
         if (revNum < Integer.MIN_VALUE || revNum > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int)revNum;
        }
    }

}
