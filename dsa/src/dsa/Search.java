package dsa;
import java.util.Arrays;
import java.util.Scanner;
public class Search {
	
	public static int linearSearch(int[] a,int s) {
		int re=-1;
		for(int i=0;i<a.length;i++) {
			if(s==a[i]) {
				return i;
			}
		}
		return re;
	}

	public static int binarySearch(int[] a,int s) {
		
		int l=0,h=a.length-1;
		while(l<=h) {
			int m=l+(h-l)/2;
			if(s==a[m])
				return m;
			else if(s<a[m])
				h=m-1;
			else
				l=m+1;
			
		}
		return -1;
	}
	public static void main(String[] args) {
		 
		int[] a= {64,34,25,12,22,11,90};
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter element to be searched");
		int s=scanner.nextInt();
//		int k=Search.linearSearch(a,s);
//		if(k==-1) {
//			System.out.println("Given number is not present in array");
//		}
//		else
//		{
//			System.out.println(s+" is present at "+k+"th index");
//		}
		
		BubbleSort.bubbleSort(a);
		Arrays.stream(a).forEach(System.out::println);
		int k=Search.binarySearch(a, s);
		
		if(k==-1) {
			System.out.println("Given number is not present in array");
		}
		else
		{
			System.out.println(s+" is present at "+k+"th index");
		}
		
	}
}
