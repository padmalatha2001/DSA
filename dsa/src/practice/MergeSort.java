package practice;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr={3,4,2,5,6,1};
        sortMerge(arr,0,arr.length-1);
        Arrays.stream(arr).forEach(i->{
        	System.out.print(i+" ");
        });
	}

	

	private static void sortMerge(int[] arr, int low, int high) {
		if(low<high)
		{
			int mid=low+(high-low)/2;
			sortMerge(arr,low,mid);
			sortMerge(arr,mid+1, high);
			merge(arr,low,mid,high);
		}
		
	}

   public static void merge(int[] arr,int low,int mid,int high) {
	  int n1=mid-low+1;
	  int n2=high-mid;
	  int[] left=new int[n1];
	  int[] right=new int[n2];
	  for(int i=0;i<n1;i++)
		    left[i]=arr[low+i];
	  for(int j=0;j<n2;j++) 
	       right[j]=arr[mid+j+1];
	  
	  int i=0,j=0,k=low;
	  while(i<n1&&j<n2) {
		  if(left[i]<right[j]) {
			  arr[k++]=left[i++];
		  }
		  else 
			  arr[k++]=right[j++];
		  
	  }
	  while(i<n1) {
		  arr[k++]=left[i++];
	  }
	  while(j<n2) {
		  arr[k++]=right[j++];
	  }
	  
	  
	 
   }

	
	

}
