package com.coding.questions.interviews.sortings;

public class SelectionSort {
    public static void main(String[] args) {
        int a[] = doSorting(new int[]{1,2,9,2,3,5,6,7,4,9,8,4,4,99,77,66,34,21,101});

        for (int n : a) {
            System.out.print(n+" ");
        }
    }

    static int[] doSorting(int[] arr) {
        int result[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int min=arr[i],k = arr[i],l=i;
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    l=j;
                }
            }
            arr[l]=k;
            arr[i]=min;
        }
        return arr;
    }

    public static int[] doSortingNew(int a[]) {
        int temp;

        for(int i=0; i<a.length-1; i++){
            for(int j=i+1; j<a.length;j++){
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }

}
