package dsa;

import java.util.Arrays;

public class QuickSort {
	 
	
	public void sort(int a[],int l,int h)
	{
		if(l>=h)
			return;
		int m=l+(h-l)/2;
		int pivot=a[m];
		int s=l,e=h;
		while(s<=e)
		{
			while(a[s]<pivot)
			s++;
		   while(a[e]>pivot)
			e--;
	    	if(s<=e)
	    	{
	          int temp=a[s];
	          a[s]=a[e];
	          a[e]=temp;
	          s++;e--;
	    	}
	    	
		}
		
		sort(a,l,e);
    	sort(a,s,h);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {64,34,25,12,22,11,90};
		QuickSort quick=new QuickSort();
		quick.sort(a, 0, a.length-1);
		Arrays.stream(a).forEach(k->System.out.print(k+" "));
		
	}

}
