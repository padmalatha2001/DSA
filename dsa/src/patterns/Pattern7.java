package patterns;

import java.util.stream.IntStream;
import java.util.concurrent.atomic.*;
public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	1 2 3 4 5 
		2 4 6 8 10 
		3 6 9 12 15 
		4 8 12 16 20 
		5 10 15 20 25 
    */
//		IntStream.rangeClosed(1, 5).forEach(row->{
//			IntStream.rangeClosed(1, 5).forEach(col->{
//				System.out.print(row*col+" ");
//			});
//			System.out.println();
//		});
		
		
	/*	1 1 2 1 3 1 
		1 2 2 2 3 2 
		1 3 2 3 3 3 
		1 4 2 4 3 4 
		1 5 2 5 3 5 
		1 6 2 6 3 6 
     */
//		IntStream.rangeClosed(1, 6).forEach(row->{
//			IntStream.rangeClosed(1,3).forEach(col->{
//				System.out.print(col+" "+row+" ");
//			});
//			System.out.println();
//		});
		
		
	 /*	
		1 1 1 2 1 3 
		2 1 2 2 2 3 
		3 1 3 2 3 3 
		4 1 4 2 4 3 
		5 1 5 2 5 3 
		
	  */
		IntStream.range(1, 6).forEach(row->{
			IntStream.rangeClosed(1,3).forEach(col->{
				System.out.print(row+" "+col+" ");
			});
			System.out.println();
		});
	}

}
