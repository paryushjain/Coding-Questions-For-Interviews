package com.coding.questions.interviews.sortings;

public class BubbleSort {

	public static void main(String[] args) {
		int a[] = doSortingBubble(new int[] {1,2,3,4,6,5});
		
		for(int n:a) {
			System.out.print(n + " ");
		}

		/*char b[] = doSorting(new char[] {'a','B','b','d','A'});

		for(char n:b) {
			System.out.print(n);
		}*/
	}
	
	public static int[] doSorting(int a[]) {
		int temp=0;
		
		for(int i=a.length ; i>=0; i--){
			for(int j=0; j<i-1 ;j++){
				if(a[j]>a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		return a;
	}


	public static char[] doSorting(char a[]) {
		char temp;

		for(int i=a.length ; i>=0; i--){
			for(int j=0; j<i-1 ;j++){
				if(a[j]>a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}

		return a;
	}

	public static int[] doSortingBubble(int a[]) {
		int temp;

		for(int i=0; i<a.length-1; i++){
			boolean swapped = false;
			for(int j=0; j<a.length-i-1;j++){
				if(a[j]>a[j+1]){
					swapped = true;
					temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			if(!swapped){
				break;
			}
		}
		return a;
	}
}
