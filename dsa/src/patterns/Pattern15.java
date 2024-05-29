package patterns;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AtomicInteger num=new AtomicInteger(0);
		IntStream.rangeClosed(1, 5).forEach(row->{
			
			IntStream.rangeClosed(1,5-row).forEach(sp->{
				System.out.print("  ");
			});
			IntStream.rangeClosed(1, row).forEach(col->{
				System.out.print(num.addAndGet(2)+" ");
			});
			System.out.println();
		});
	}

}
