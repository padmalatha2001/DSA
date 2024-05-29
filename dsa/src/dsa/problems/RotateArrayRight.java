package dsa.problems;

import java.util.Arrays;

public class RotateArrayRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,2,3,4,5,6,7,8};
		int k=3,n=arr.length;
		
		reverse(arr,0,n-1);
		reverse(arr,0,k-1);
		reverse(arr,k,n-1);
		Arrays.stream(arr).forEach(a->System.out.printf(a+" "));
	}

	public static void reverse(int[] a,int start,int end)
	{
		while(start<=end) {
			int temp=a[start];
			a[start++]=a[end];
			a[end--]=temp;
		}
	}
}
