package patterns;

import java.util.stream.IntStream;

public class Pattern20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        IntStream.rangeClosed(1, 5).forEach(row->{
//        	IntStream.rangeClosed(1,5).forEach(col->{
//        		if(row==col||col==5-row+1) {
//        			System.out.print(5-row+1+" ");
//        		}
//        		else {
//        			System.out.print("  ");
//        		}
//        	});
//        	System.out.println();
//        });
        
        
        
//        IntStream.rangeClosed(1, 5).forEach(row->{
//        	IntStream.rangeClosed(1,5).forEach(col->{
//        		if(col==3||row==3) {
//        			System.out.print("* ");
//        		}
//        		else {
//        			System.out.print("  ");
//        		}
//        	});
//        	System.out.println();
//        });
		
		
//		IntStream.rangeClosed(1, 5).forEach(row->{
//			IntStream.rangeClosed(1,5).forEach(col->{
//				if(row==1||col==1||row==5||col==5||row==col||col==5-row+1) {
//					System.out.print("* ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			});
//			System.out.println();
//		});
		
		
		
		
//		IntStream.rangeClosed(1, 5).forEach(row->{
//			IntStream.rangeClosed(1,5).forEach(col->{
//				if(col==1||row==5||row==col) {
//					System.out.print("* ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			});
//			System.out.println();
//		});
		
		
		
//		IntStream.rangeClosed(1, 5).forEach(row->{
//			IntStream.rangeClosed(1,5).forEach(col->{
//				if(row==1||col==1||col==5-row+1) {
//					System.out.print("* ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			});
//			System.out.println();
//		});
		
		
		
		
//		IntStream.rangeClosed(1, 5).forEach(row->{
//			IntStream.rangeClosed(1,5).forEach(col->{
//				if(row==5||col==5||col==5-row+1) {
//					System.out.print("* ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			});
//			System.out.println();
//		});
		
		
		
		
		IntStream.rangeClosed(1, 5).forEach(row->{
			IntStream.rangeClosed(1,5).forEach(col->{
				if(row==1||col==5||row==col) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			});
			System.out.println();
		});
	}

}
