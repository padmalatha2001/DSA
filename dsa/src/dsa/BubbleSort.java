package dsa;

import java.util.Arrays;

public class BubbleSort {
	
	public static int[] bubbleSort(int[] a)
	{
		int n=a.length,temp;
		for(int i=0;i<n-1;i++) {
		     for(int j=0;j<n-i-1;j++) {
		    	 if(a[j]>a[j+1])
		    	 {
		    		 temp=a[j];
		    		 a[j]=a[j+1];
		    		 a[j+1]=temp;
		    	 }
		     }
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a= {64,34,25,12,22,11,90};
        BubbleSort.bubbleSort(a);
        Arrays.stream(a).forEach(System.out::println);
	}

}
