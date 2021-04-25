package com.coding.questions.interviews.commonproblems;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        if(n==1 || n ==2){
            return n;
        }
        return n * factorial(n-1);
    }

}
