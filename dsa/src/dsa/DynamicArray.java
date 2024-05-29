package dsa;

import java.util.Arrays;

public class DynamicArray {
	
	public static void main(String[] args) {
		int[] a=new int[5];
		for(int i=0;i<10;i++) {
			if(i<5)
			    a[i]=i;
			else
			{
				a=Arrays.copyOf(a, a.length+1);
			    a[i]=i;
			}
		}
		
		for(int i=0;i<9;i++) {
			System.out.println(a[i]);
		}
	}

}
