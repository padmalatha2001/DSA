package patterns;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//AtomicInteger x=new AtomicInteger(5);
		//AtomicInteger y=new AtomicInteger(6);
		IntStream.rangeClosed(1, 5).forEach(row->{
			AtomicInteger x=new AtomicInteger(row);
			AtomicInteger y=new AtomicInteger(5-row+1);
			IntStream.rangeClosed(1, 5).forEach(col->{
				if(col%2==0) {
					System.out.print(x+" ");
				}
				else {
					int k=y.get();
					System.out.print(y+" ");
					
				}
				x.addAndGet(5);
				y.addAndGet(5);
				
			});
			
			System.out.println();
		});
	}

}
