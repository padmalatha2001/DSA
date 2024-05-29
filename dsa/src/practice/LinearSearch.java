package practice;
import java.util.Scanner;
public class LinearSearch {

	public static int linearSearch(int[] arr,int k) {
		
		for(int i=0;i<arr.length;i++) {
			if(k==arr[i])
				return i;
		}
		
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter element to be searched");
        int se=scanner.nextInt();
		int[] arr= {1,4,6,8,2,5,7,10};
		int p=linearSearch(arr, se);
		System.out.println(se+" is present in "+p+" th index");
	}

}
