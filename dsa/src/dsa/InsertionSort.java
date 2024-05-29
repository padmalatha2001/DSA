package dsa;

import java.util.Arrays;

public class InsertionSort {

	public static void sort(int[] a) {
		for(int i=1;i<a.length;i++) {
			int k=a[i];
			int j=i-1;
			while(j>=0&&a[j]>k)
			{
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=k;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {64,34,25,12,22,11,90};
		sort(a);
		Arrays.stream(a).forEach(k->System.out.print(k+" "));
	}

}
