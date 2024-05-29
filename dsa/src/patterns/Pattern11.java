package patterns;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    /*
		1 2 3 4 5 
		2 3 4 5 6 
		3 4 5 6 7 
		4 5 6 7 8 
		5 6 7 8 9 
		
	*/
//		IntStream.rangeClosed(1, 5).forEach(row->{
//			IntStream.rangeClosed(1,5).forEach(col->{
//				System.out.print(row+col-1+" ");
//			});
//			System.out.println();
//		});
		
		
		
		
	/*
		1 3 5 7 9 
		3 5 7 9 11 
		5 7 9 11 13 
		7 9 11 13 15 
		9 11 13 15 17 
     */
//		IntStream.rangeClosed(1, 5).forEach(row->{
//			AtomicInteger num=new AtomicInteger(row*2-3);
//			IntStream.rangeClosed(1, 5).forEach(col->{
//				System.out.print(num.addAndGet(2)+" ");
//			});
//			System.out.println();
//		});
		
		
	/*
		0 1 0 1 0 
		1 0 1 0 1 
		0 1 0 1 0 
		1 0 1 0 1 
		0 1 0 1 0
		
	*/
//		IntStream.rangeClosed(1, 5).forEach(row->{
//			IntStream.rangeClosed(1,5).forEach(col->{
//			
//		      System.out.print((row+col)%2+" ");
//			});
//			System.out.println();
//		});
		
		
		
		
		
		
    /*
		1 0 1 0 1 
		0 1 0 1 0 
		1 0 1 0 1 
		0 1 0 1 0 
		1 0 1 0 1 
     */
//			IntStream.rangeClosed(1, 5).forEach(row->{
//			IntStream.rangeClosed(1,5).forEach(col->{
//			    if((row+col)%2==0)
//		           System.out.print(1+" ");
//			    else
//			     System.out.print(0+" ");
//			});
//			System.out.println();
//		});
		
	
		
		
		
	/*	
		1 0 1 0 1 
		0 0 0 0 0 
		1 0 1 0 1 
		0 0 0 0 0 
		1 0 1 0 1 

	*/	
		
//		IntStream.rangeClosed(1, 5).forEach(row->{
//			IntStream.rangeClosed(1,5).forEach(col->{
//				if(row%2==0)
//					System.out.print(0+" ");
//				else if((row+col)%2==0)
//		           System.out.print(1+" ");
//			    else
//			     System.out.print(0+" ");
//			});
//			System.out.println();
//		});
		
		
		IntStream.rangeClosed(1, 5).forEach(row->{
			IntStream.rangeClosed(1,5).forEach(col->{
				if(row%2==0)
					System.out.print(0+" ");
			    else
			     System.out.print((row+col)%2+" ");
			});
			System.out.println();
		});
		
		
	}

}
