package com.coding.questions.interviews.recursions;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr=new int[]{1, 2, 3, 4, 5, 6, 7, 8, 11, 33, 45, 76, 88, 99, 110};
        System.out.println(search(110,arr,arr.length-1,0));
    }
    public static int search(int key, int arr[], int high, int low){
        if(high >= low) {
            int mid = low+(high-low)/2;
            if (arr[mid] == key) {
                return mid;
            }
            if(arr[mid]>key){
                return search(key, arr, mid-1,low);
            }
            return search(key,arr,high,mid+1);
        }
        return -1;
    }

}
