package patterns;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	
		1 6 11 16 21 
		2 7 12 17 22 
		3 8 13 18 23 
		4 9 14 19 24 
		5 10 15 20 25 
	*/
//		IntStream.rangeClosed(1, 5).forEach(row->{
//			System.out.print(row+" ");
//			IntStream.rangeClosed(2,5).forEach(col->{
//				System.out.print(row+(col-1)*5+" ");
//				
//			});
//			System.out.println();
//		});
		
		
	/*
		1 10 11 20 21 
		2 9 12 19 22 
		3 8 13 18 23 
		4 7 14 17 24 
		5 6 15 16 25 
	*/
		IntStream.rangeClosed(1, 5).forEach(row->{
			 AtomicInteger x=new AtomicInteger(row);
			 AtomicInteger y=new AtomicInteger(5-row+1);
			IntStream.rangeClosed(1,5).forEach(col->{
			   if(col%2==1)
				 {
				   System.out.print(x+" ");
				 }
			   else {
				   System.out.print(y+" ");
			   }
			     x.addAndGet(5);
			     y.addAndGet(5);
			});
			System.out.println();
		});
		
		
	}

}
