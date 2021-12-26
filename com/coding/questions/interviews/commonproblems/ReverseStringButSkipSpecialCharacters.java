package com.coding.questions.interviews.commonproblems;

/**
 *
 */
public class ReverseStringButSkipSpecialCharacters {

    public static void main(String[] args) {
        System.out.printf(reverseEasy("abc!d#e$f*ghij**klm::"));
    }

    public static String reverse(String input){
        char[] outputArr =input.toCharArray();
        int j=input.length()-1;
        for (int i=0;i<input.length()&&j>=0;i++){
            while(input.charAt(i)>'z'||input.charAt(i)<'A'){
                i++;
            }
            while(input.charAt(j)>'z'||input.charAt(j)<'A'){
                j--;
            }
            outputArr[j]=input.charAt(i);
            j--;
        }
        return String.copyValueOf(outputArr);
    }

    public static String reverseEasy(String input){
        char[] outputArr =input.toCharArray();
        int l=0,r=input.length()-1;
        while(l<r){
            if(!Character.isAlphabetic(input.charAt(l))){
                l++;
            }else if(!Character.isAlphabetic(input.charAt(r))){
                r--;
            }else{
                char temp=input.charAt(r);
                outputArr[r--]=input.charAt(l);
                outputArr[l++]=temp;
            }
        }
        return String.copyValueOf(outputArr);
    }
}


