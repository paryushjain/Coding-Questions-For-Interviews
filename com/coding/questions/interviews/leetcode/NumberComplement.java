package com.coding.questions.interviews.leetcode;

/**
 * https://leetcode.com/problems/number-complement/
 * @author paryjain
 *
 */
public class NumberComplement {

	public static void main(String[] args) {

	}
	
public static int findComplement(int num) {
        String a = Integer.toBinaryString(num);
        String b = "";
        char []x = a.toCharArray();
        for(char i : x) {
        	if(i == '0') {
        		b = b + "1";
        	}else {
        		b = b + "0";
        	}
        }
         return Integer.parseInt(b , 2);
    }

}
