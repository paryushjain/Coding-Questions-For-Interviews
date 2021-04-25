package com.coding.questions.interviews.commonproblems;

public class Fibonacci {

    public static void main(String[] args) {
        //System.out.println(fibonacciRecursive(8));
        System.out.println(fibonacciIterative(8));
    }

    public static int fibonacciRecursive(int n){
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }

    public static int fibonacciIterative(int n){
        int n1=0,n2=1;
        int counter =2;
        int sum = 0;
        while(counter<n){
            sum = n1+n2;
            n1=n2;
            n2=sum;
            counter++;
        }
        return sum;
    }

}
