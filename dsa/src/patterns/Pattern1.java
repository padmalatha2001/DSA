package patterns;

import java.util.stream.IntStream;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//           IntStream.rangeClosed(1, 5).forEach(row->{
//        	   IntStream.rangeClosed(1, row).forEach(col->{
//        		  System.out.print("* "); 
//        	   });
//        	   System.out.println();
//           });
	
//	IntStream.rangeClosed(1, 5).forEach(row->{
//		IntStream.rangeClosed(1, row).forEach(col->{
//		  System.out.print(col+" ");	
//		});
//		System.out.println();
//	});
		
//		IntStream.rangeClosed(1, 5).forEach(row->{
//			IntStream.rangeClosed(1, row).forEach(col->{
//				System.out.print((char)(65+col-1)+" ");
//			});
//			
//			System.out.println();
//		});
		
		
//		IntStream.rangeClosed(1, 5).forEach(row->{
//			IntStream.rangeClosed(1, row).forEach(col->{
//				System.out.print((5-row+1)+" ");
//			});
//			
//			System.out.println();
//		});
		
		
		IntStream.rangeClosed(1, 5).forEach(row->{
			IntStream.rangeClosed(1, row).forEach(col->{
				System.out.print((5-col+1)+" ");
			});
			
			System.out.println();
		});
	
	}

}
