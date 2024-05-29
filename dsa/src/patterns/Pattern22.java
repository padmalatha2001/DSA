package patterns;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AtomicInteger px=new AtomicInteger(1);
		AtomicInteger py=new AtomicInteger(5*2-1);
		IntStream.rangeClosed(1, 5).forEach(row->{
			IntStream.rangeClosed(1,5*2).forEach(col->{
				if(px.get()==col||col==py.get())
				{
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
