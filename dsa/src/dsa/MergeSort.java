package dsa;

import java.util.Arrays;

public class MergeSort {

	public void sort(int a[],int b,int m,int r) {
		
		int n1=m-b+1;
		int n2=r-m;
		
		int left[]=new int[n1];
		int[] right=new int[n2];
		
		for(int i=0;i<n1;i++)
			left[i]=a[b+i];
		for(int j=0;j<n2;j++)
			right[j]=a[m+j+1];
		
		int k=b,i=0,j=0;
		
		while(i<n1&&j<n2)
		{
			if(left[i]<right[j])
				a[k++]=left[i++];
			else
				a[k++]=right[j++];
		}
		while(i<n1)
		{
			a[k++]=left[i++];
		}
		while(j<n2)
		{
			a[k++]=right[j++];
		}
	}
	public void mergeSort(int a[],int begin,int end) {
		
		if(begin<end)
		{
			int m=begin+(end-begin)/2;
			mergeSort(a,begin,m);
			mergeSort(a,m+1,end);
			sort(a,begin,m,end);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {64,34,25,12,22,11,90};
		//Arrays.stream(a).forEach(k->System.out.print(k+" "));
		MergeSort mergeSort=new MergeSort();
		mergeSort.mergeSort(a, 0, a.length-1);
		Arrays.stream(a).forEach(k->System.out.print(k+" "));
		
	}

}
