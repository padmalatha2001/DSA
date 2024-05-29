package practice;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]= {3,4,2,5,6,1};
       sort(arr);
       Arrays.stream(arr).forEach(i->{
    	   System.out.print(i+" ");
       });
	}
     public static int[] sort(int[] arr) {
      int n=arr.length;
      
      for(int i=0;i<n;i++) {
    	  for(int j=0;j<n-i-1;j++) {
    		  if(arr[j]>arr[j+1]) {
    			  int temp=arr[j];
    			  arr[j]=arr[j+1];
    			  arr[j+1]=temp;
    			  
    		  }
    	  }
      }
      return arr;
     }
}
