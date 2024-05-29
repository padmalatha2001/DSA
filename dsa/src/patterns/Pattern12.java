package patterns;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
		A A A A A 
		B B B B B 
		C C C C C 
		D D D D D 
		E E E E E 
    */
//		AtomicInteger num=new AtomicInteger(65);
//		
//		IntStream.rangeClosed(1, 5).forEach(row->{
//				IntStream.rangeClosed(1,5).forEach(col->{
//				System.out.print((char)num.get()+" ");
//			});
//			num.incrementAndGet();
//			System.out.println();
//		});
	
		
	/*
		A B C D E 
		A B C D E 
		A B C D E 
		A B C D E 
		A B C D E
	*/

//        IntStream.rangeClosed(1, 5).forEach(row->{
//			AtomicInteger num=new AtomicInteger(65);
//				IntStream.rangeClosed(1,5).forEach(col->{
//				System.out.print((char)num.get()+" ");
//				num.incrementAndGet();
//			});
//			 System.out.println();
//		});
		
		
	/*	
		E E E E E 
		D D D D D 
		C C C C C 
		B B B B B 
		A A A A A 
	*/
//		IntStream.rangeClosed(1, 5).forEach(row->{
//			AtomicInteger num=new AtomicInteger(65+5-row);
//				IntStream.rangeClosed(1,5).forEach(col->{
//				System.out.print((char)num.get()+" ");
//				
//			});
//				num.decrementAndGet();
//			 System.out.println();
//		});
		
	/*	
		E D C B A 
		E D C B A 
		E D C B A 
		E D C B A 
		E D C B A 
	*/	
//		IntStream.rangeClosed(1, 5).forEach(row->{
//			AtomicInteger num=new AtomicInteger(69);
//				IntStream.rangeClosed(1,5).forEach(col->{
//				System.out.print((char)num.get()+" ");
//				num.decrementAndGet();
//			});
//				
//			 System.out.println();
//		});
		 
	/*
	  A B C D E 
      F G H I J 
      K L M N O 
      P Q R S T 
      U V W X Y 
	 */
		
//	AtomicInteger num=new AtomicInteger(65);
//		IntStream.rangeClosed(1, 5).forEach(row->{
//			IntStream.rangeClosed(1,5).forEach(col->{
//				System.out.print((char)num.get()+" ");
//				num.incrementAndGet();
//			});
//				
//			 System.out.println();
//		});
		
		/*
		 A F K P U 
         B G L Q V 
         C H M R W 
         D I N S X 
         E J O T Y 
		 */
		
		IntStream.rangeClosed(1, 5).forEach(row->{
			IntStream.rangeClosed(1,5).forEach(col->{
				AtomicInteger num=new AtomicInteger(64+(5*col-row+1));
				System.out.print((char)num.get()+" ");
				
			});
				
			 System.out.println();
		});
		
	}

}
