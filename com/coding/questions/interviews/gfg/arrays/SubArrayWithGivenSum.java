package com.coding.questions.interviews.gfg.arrays;

import java.util.ArrayList;

/**
 * https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1
 */
public class SubArrayWithGivenSum {

    public static void main(String[] args) {

        ArrayList<Integer> result = subarraySum(new int[] {135,101, 170, 125, 79, 159, 163, 65, 106, 146, 82, 28, 162,
                92, 196, 143, 28, 37, 192, 5 ,103, 154, 93, 183, 22, 117, 119, 96, 48, 127, 172,
                139, 70, 113, 68, 100, 36, 95, 104, 12, 123 ,134
        }, 42, 468);

        result.forEach(System.out::println);

    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {

        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        int high = 0, low = 0, sum = arr[0];

        while ((high < n)&&(low< n)){
            if (sum == s) {
                list.add(low + 1);
                list.add(high + 1);
                return list;
            } else if (sum < s) {
                high++;
                sum = sum + arr[high];
            } else {
                sum = sum - arr[low++];
            }
        }


        list.add(-1);

        return list;

    }

}
