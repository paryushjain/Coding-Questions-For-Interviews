package com.coding.questions.interviews.sortings;

public class MergeSort {

	public static void main(String[] args) {
		int a[] = doSorting(new int[] {15,9,1,17});
		for(int n:a) {
			System.out.print(n + " ");
		}
	}

	private static int[] doSorting(int[] arr) {

		if(arr.length <= 1){
			return arr;
		}
		int mid = arr.length/2;
		int left[] = new int[mid];
		int right[];
		if(arr.length%2==0){
			right = new int[mid];
		}else{
			right = new int[mid+1];
		}
		for(int i=0; i<left.length; i++){
			left[i]=arr[i];
		}
		for(int j=0;j< right.length;j++){
			right[j]=arr[j+mid];
		}
		left = doSorting(left);
		right = doSorting(right);
		return merge(left,right);
	}

	static int[] merge(int[] left,int[] right){
		int result[] = new int[left.length + right.length];

		int l=0,r=0,res=0;
		while(left.length>l || right.length>r) {
			if(left.length>l && right.length>r) {
				if (left[l] < right[r]) {
					result[res++] = left[l++];
				} else {
					result[res++] = right[r++];
				}
			}else if(left.length>l){
				result[res++] = left[l++];
			}else{
				result[res++] = right[r++];
			}
		}
		return result;
	}

}
