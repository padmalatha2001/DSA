package dsa;

import java.util.Arrays;

public class SelectionSort {

	public void sort(int[] a) {
		int n=a.length,minIndex;
		for(int i=0;i<n-1;i++) {
			minIndex=i;
			for(int j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
					minIndex=j;
				}
			}
			
			if(minIndex!=i) {
				int temp=a[i];
				a[i]=a[minIndex];
				a[minIndex]=temp;
			}
		}
	}
	public static void main(String[] args) {
		int[] a= {64,34,25,12,22,11,90};
	    SelectionSort selection=new SelectionSort();
	    selection.sort(a);
	    Arrays.stream(a).forEach(k->System.out.print(k+" "));
	}
}
