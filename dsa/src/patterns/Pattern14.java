package patterns;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntStream.rangeClosed(1, 5).forEach(row->{
			AtomicInteger num=new AtomicInteger(5-row+1);
			AtomicInteger it=new AtomicInteger(4);
			IntStream.rangeClosed(1,5-row+1).forEach(col->{
				System.out.print(num+" ");
				num.addAndGet(it.get());
				it.decrementAndGet();
			});
			System.out.println();
		});
	}

}
