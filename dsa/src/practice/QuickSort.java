package practice;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {64,34,25,12,22,11,90};
		QuickSort quick=new QuickSort();
		quick.sort(a, 0, a.length-1);
		Arrays.stream(a).forEach(k->System.out.print(k+" "));
	}

	public static void sort(int[] arr,int low,int high) {
		if(low>=high)
			return;
		int start=low;
		int end=high;
		int mid=low+(high-low)/2;
		int pivot=arr[mid];
		while(start<=end) {
			while(arr[start]<pivot)
				start++;
			while(arr[end]>pivot)
				end--;
			if(start<=end)
			{
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				start++;
				end--;
			}
	        sort(arr,low,end);
	        sort(arr,start,high);
		}
	}

}
