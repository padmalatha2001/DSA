package patterns;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  /*
		1 
		1 2 
		1 2 3 
		1 2 3 4 
		1 2 3 4 5 
    */
//		IntStream.rangeClosed(1, 5).forEach(row->{
//			IntStream.rangeClosed(1, row).forEach(col->{
//				System.out.print(col+" ");
//			});
//			System.out.println();
//		});
		
		
	 /*	
		1
		2 2 
        3 3 3 
        4 4 4 4 
        5 5 5 5 5
	 */
//		IntStream.rangeClosed(1, 5).forEach(row->{
//			IntStream.rangeClosed(1, row).forEach(col->{
//				System.out.print(row+" ");
//			});
//			System.out.println();
//		});
		
	/*	
		5 
		5 4 
		5 4 3 
		5 4 3 2 
		5 4 3 2 1 
	*/
//		IntStream.rangeClosed(1, 5).forEach(row->{
//			AtomicInteger num=new AtomicInteger(5+1);
//			IntStream.rangeClosed(1, row).forEach(col->{
//				System.out.print(num.decrementAndGet()+" ");
//			});
//			System.out.println();
//		});
	
	/*	
		5 
		4 5 
		3 4 5 
		2 3 4 5 
		1 2 3 4 5 
	 */
//		IntStream.rangeClosed(1, 5).forEach(row->{
//			AtomicInteger num=new AtomicInteger(5-row);
//			IntStream.rangeClosed(1, row).forEach(col->{
//				System.out.print(num.incrementAndGet()+" ");
//			});
//			System.out.println();
//		});
		
		
	/*	
		2 
		2 4 
		2 4 6 
		2 4 6 8 
		2 4 6 8 10
	 */ 
//		IntStream.rangeClosed(1, 5).forEach(row->{
//			AtomicInteger num=new AtomicInteger(2);
//			IntStream.rangeClosed(1, row).forEach(col->{
//				System.out.print(num.get()+" ");
//				num.addAndGet(2);
//			});
//			System.out.println();
//		});
		
//		AtomicInteger num=new AtomicInteger(0);
//		IntStream.rangeClosed(1, 5).forEach(row->{
//			
//			IntStream.rangeClosed(1, row).forEach(col->{
//				System.out.print(num.incrementAndGet()+" ");
//				
//			});
//			System.out.println();
//		});
		
		final String college="oxford";
		final int k=5;
		switch(k) {
		case k:System.out.println();
		}
	}

}
