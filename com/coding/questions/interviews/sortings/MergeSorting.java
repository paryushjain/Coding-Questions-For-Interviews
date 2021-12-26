package com.coding.questions.interviews.sortings;

public class MergeSorting {

    public static void main(String[] args) {
        int a[] = new int[] {13,7,9,5,2,11,8};
        mergeSort(a, 0, a.length-1);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    private static void mergeSort(int arr[], int l, int r) {
        if(l<r){
            int mid = (l+r)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }

    private static void merge(int[] arr, int l, int mid, int r) {
        int i=l,j=mid+1,k=l;
        int b[] = new int[arr.length];
        while(i<=mid && j<=r){
            if (arr[i]>arr[j]) {
                b[k++]=arr[j++];
            }else{
                b[k++]=arr[i++];
            }
        }
        if(i>mid){
            while(j<=r){
                b[k++]=arr[j++];
            }
        }else{
            while(i<=mid){
                b[k++]=arr[i++];
            }
        }
        for(int x=l;x<=r;x++){
            arr[x]=b[x];
        }
    }
}
