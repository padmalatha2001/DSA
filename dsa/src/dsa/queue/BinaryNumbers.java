package dsa.queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
public class BinaryNumbers {
	public static String[] generate(int n) {
		
		
		 String[] result = new String[n];
	        Queue<String> q = new LinkedList<>();
	        q.offer("1");

	        for (int i = 0; i < n; i++) {
	            result[i] = q.poll();
	            String n2 = result[i] + "1";
	            String n1 = result[i] + "0";

	            q.offer(n1);
	            q.offer(n2);
	        }

	        return result;
	}

	public static void main(String[] args) {
	     String[] bin=generate(5);
	     Arrays.stream(bin).forEach(k->System.out.println(k));
	}
}
