package com.coding.questions.interviews;

/**
 * @author paryjain
 * https://leetcode.com/problems/defanging-an-ip-address/
 *
 */
public class DefangingAnIPAddress {

	public static void main(String[] args) {
		System.out.println(defangIPaddr2("1.1.1.1"));
	}

	public static String defangIPaddr(String address) {
		return address.replaceAll("[.]", "[.]");
	}
	
	public static String defangIPaddr2(String address) {
		
		String s="";
		for(int i=0; i<address.length();i++) {
			if(address.charAt(i) == '.') {
				s += "[.]";
			}else {
				s += address.charAt(i);
			}
		}
		
		return s;
		
	}

}
