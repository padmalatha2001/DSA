package patterns;

import java.util.stream.IntStream;

public class Pattern4 {
   public static void main(String[] args) {
	IntStream.range(1, 6).forEach(row->{
		IntStream.range(1, 6).forEach(col->{
		  System.out.print("* ");	
		});
		System.out.println();
	});
 }
}
