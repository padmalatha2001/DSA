package dsa.stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

	public static int[] nextGreater(int[] arr) {
		
		int[] re=new int[arr.length];
		Stack<Integer> stack=new Stack<>();
		for(int i=arr.length-1;i>=0;i--) {
			if(!stack.isEmpty()) {
				while(!stack.isEmpty()&&stack.peek()<arr[i])
				{
					stack.pop();
				}
			}
			if(stack.isEmpty()) {
				re[i]=-1;
			}
			else {
				re[i]=stack.peek();
			}
			stack.push(arr[i]);
		}
		
		return re;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {4,7,3,4,8,1};
		int[] result=nextGreater(arr);
		Arrays.stream(result).forEach(k->System.out.print(k+" "));
	}

}
