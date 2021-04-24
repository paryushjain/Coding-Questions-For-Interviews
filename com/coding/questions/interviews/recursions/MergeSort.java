package com.coding.questions.interviews.recursions;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr=new int[]{1001,1,2,9,2,3,5,6,7,4,9,8,4,4,99,77,88,87,86,93,94};
        arr = sort(arr, arr.length,0);
    }

    public static int[] sort(int[] arr,int high, int low){
        if(arr.length<=1){
            return arr;
        }
        int mid = low + (high-low)/2;
        sort(arr,low, mid);
        sort(arr,mid+1,high);
        merge(arr,low,mid,high);
        return arr;
    }
    public static int[] merge(int[] arr,int low, int high, int mid){
        return arr;
    }
}
