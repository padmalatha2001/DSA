package patterns;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      IntStream.rangeClosed(1, 5).forEach(row->{
//    	  IntStream.rangeClosed(1,5).forEach(col->{
//    		 System.out.print(col+" "); 
//    	  });
//    	  System.out.println();
//      });
		
//		 IntStream.rangeClosed(1, 5).forEach(row->{
//	    	  IntStream.rangeClosed(1,5).forEach(col->{
//	    		 System.out.print(row+" "); 
//	    	  });
//	    	  System.out.println();
//	      });
		
		//AtomicInteger num=new AtomicInteger(6);
		 IntStream.rangeClosed(1, 5).unordered().forEach(row->{
			 AtomicInteger num=new AtomicInteger(6);
	    	  IntStream.rangeClosed(1,5).forEach(col->{
	    		 System.out.print(num.decrementAndGet()+" "); 
	    	  });
	    	 
	    	  System.out.println();
	      });
	}

}
