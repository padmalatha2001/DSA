package patterns;

import java.util.concurrent.atomic.*;
import java.util.stream.IntStream;
public class Pattern6 {

	public static void main(String[] args) {
		
	/*	1 2 3 4 5 
		6 7 8 9 10 
		11 12 13 14 15 
		16 17 18 19 20 
		21 22 23 24 25 */

//		AtomicInteger num=new AtomicInteger(0);
//		IntStream.rangeClosed(1, 5).forEach(row->{
//			IntStream.rangeClosed(1,5).forEach(col->{
//				System.out.print(num.incrementAndGet()+" ");
//				
//			});
//			System.out.println();
//		});
		
		
	/*  1 3 5 7 9 
		11 13 15 17 19 
		21 23 25 27 29 
		31 33 35 37 39 
		41 43 45 47 49 
	*/
//		AtomicInteger num=new AtomicInteger(0);
//		IntStream.rangeClosed(1, 5).forEach(row->{
//			IntStream.rangeClosed(1,5).forEach(col->{
//				System.out.print(num.incrementAndGet()+" ");
//				num.incrementAndGet();
//			});
//			System.out.println();
//		});
		
	/*	2 4 6 8 10 
		12 14 16 18 20 
		22 24 26 28 30 
		32 34 36 38 40 
		42 44 46 48 50
	*/
//		AtomicInteger num=new AtomicInteger(0);
//		IntStream.rangeClosed(1, 5).forEach(row->{
//			IntStream.rangeClosed(1,5).forEach(col->{
//				num.incrementAndGet();
//				System.out.print(num.incrementAndGet()+" ");
//				
//			});
//			System.out.println();
//		});
	}
}
