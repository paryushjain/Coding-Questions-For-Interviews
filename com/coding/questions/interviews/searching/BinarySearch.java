package com.coding.questions.interviews.searching;

public class BinarySearch {

    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 11, 33, 45, 76, 88, 99, 110}, 110));

    }

    public static int binarySearch(int a[], int n) {

        int first = 0, last = a.length - 1;

        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (a[mid] == n) {
                return mid;
            } else if (a[mid] > n) {
                last = mid - 1;
            } else if (a[mid] < n) {
                first = mid + 1;
            }
        }
        return -1;
    }

}
