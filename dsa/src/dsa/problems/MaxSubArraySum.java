package dsa.problems;

public class MaxSubArraySum {

	public static int maxSum(int[] a) {
		int currentSum=a[0];
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			currentSum=Math.max(a[i], currentSum+a[i]);
			max=Math.max(max, currentSum);
		}
		return max;
	}
	public static void main(String[] args) {
		int[] a={ -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSum(a));
	}
}
