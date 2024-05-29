package patterns;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Pattern9 {
	
	public static void main(String[] args) {
		
	/*
		5 10 15 20 25 
		4 9 14 19 24 
		3 8 13 18 23 
		2 7 12 17 22 
		1 6 11 16 21 
	*/
		IntStream.rangeClosed(1, 5).forEach(row->{
			AtomicInteger num=new AtomicInteger(1-row);
			IntStream.rangeClosed(1,5).forEach(col->{
				System.out.print(num.addAndGet(5)+" ");
			});
			;
			System.out.println();
		});
		
	
	}

}
