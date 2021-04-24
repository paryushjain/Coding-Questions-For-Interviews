package com.coding.questions.interviews.sortings;

import java.util.Arrays;

public class MergeSort2 {

	public static void main(String[] args) {
		int a[] = new int[] {15,9,1,17,3};
		int b[] = Arrays.copyOf(a, a.length);
		doSorting(a, b, 0, a.length-1);

		for(int n:a) {
			System.out.print(n + " ");
		}
	}

	private static void doSorting(int[] arr, int[] aux, int low, int high) {
		//base condition
		if(high==low){
			return;
		}

		//find mid-point using shift operator
		int mid = low + ((high-low) >> 1);

		doSorting(arr,aux,low,mid);
		doSorting(arr,aux,mid+1,high);
		merge(arr,aux,low,mid,high);
	}

	static void merge(int[] arr, int[] aux, int low,int mid, int high){
		int k = low, i = low, j = mid + 1;
		// While there are elements in the left and right runs
		while (i <= mid && j <= high)
		{
			if (arr[i] <= arr[j]) {
				aux[k++] = arr[i++];
			}
			else {
				aux[k++] = arr[j++];
			}
		}

		// Copy remaining elements
		while (i <= mid) {
			aux[k++] = arr[i++];
		}

		// No need to copy the second half (since the remaining items
		// are already in their correct position in the auxiliary array)

		// copy back to the original array to reflect sorted order
		for (i = low; i <= high; i++) {
			arr[i] = aux[i];
		}

	}

}
