package patterns;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Pattern23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AtomicInteger x=new AtomicInteger(1);
		int n=7;
		IntStream.rangeClosed(1,n).forEach(row->{
			IntStream.rangeClosed(1, n).forEach(col->{
			if(col==x.get())
			  System.out.print("* ");
			if(row<=n/2)
				x.incrementAndGet();
			else
			   x.decrementAndGet();
		
		});
			System.out.println();
		});
	}

}
