package com.coding.questions.interviews.commonproblems;

public class SumOfAllDigits {
    public static void main(String[] args) {
        System.out.println(sumOfAllDigits(12345));
    }

    private static int sumOfAllDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }
}
