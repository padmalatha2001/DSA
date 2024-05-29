package practice;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,2,3,4,5,6,7,8};
		 Scanner scanner=new Scanner(System.in);
	     System.out.println("Enter element to be searched");
	     int se=scanner.nextInt();
	     int p=binarySearch(arr, se);
	     System.out.println(se+" is present in "+p+" th index");

	}

	private static int binarySearch(int[] arr, int se) {
		// TODO Auto-generated method stub
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(se==arr[mid])
				return mid;
			else if(se<arr[mid])
                     high=mid-1;
			else if(se>arr[mid])
				    low=mid+1;
		}
		return -1;
	}
	
	
}
