package com.coding.questions.interviews.stack;

import java.util.Stack;

public class ParenthesisMatching {
    public static void main(String[] args) {
        System.out.println(isParenthesisMatching("]"));
    }

    private static boolean isParenthesisMatching(String brackets){
        Stack<Character> stack =  new Stack<>();
        for(int i=0; i<brackets.length();i++){
            char c = brackets.charAt(i);
            if(isOpeningBracket(c)){
                stack.push(c);
            }else {
                if (stack.empty()) {
                    return false;
                }
                if (isMatchingBracket(stack.peek(), c)) {
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        if(stack.empty()){
            return true;
        }
        return false;
    }

    private static boolean isOpeningBracket(char c){
        return c=='{' || c=='(' || c=='[';
    }

    private static boolean isMatchingBracket(char c, char d){
        return (c=='{'&&d=='}') || (c=='('&&d==')') || (c=='['&&d==']');
    }
}
