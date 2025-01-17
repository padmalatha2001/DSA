package patterns;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		AtomicInteger os=new AtomicInteger(4);
//		AtomicInteger is=new AtomicInteger(0);
//		IntStream.rangeClosed(1,5).forEach(row->{
//			IntStream.rangeClosed(1,os.get()).forEach(k->{
//				System.out.print(" ");
//			});
//			os.decrementAndGet();
//			if(row==1) {
//				System.out.print(row);
//			}
//			else {
//				System.out.print(row);
//				if(is.get()==0)
//				   is.incrementAndGet();
//				else
//				  is.addAndGet(2);
//				IntStream.rangeClosed(1,is.get()).forEach(x->{
//					System.out.print(" ");
//				});
//				System.out.print(row);
//			}
//			System.out.println();
//		});
		
		AtomicInteger px=new AtomicInteger(5);
		AtomicInteger py=new AtomicInteger(5);
		IntStream.rangeClosed(1, 5).forEach(row->{
			IntStream.rangeClosed(1,2*5).forEach(col->{
				if(col==px.get()||col==py.get()) {
					System.out.print(row+" ");
				}
				else {
					System.out.print("  ");
				}
				
				
			});
			px.incrementAndGet();
			py.decrementAndGet();
			System.out.println();
		});
		
	}

}
