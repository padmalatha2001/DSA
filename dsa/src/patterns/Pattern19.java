package patterns;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scanner =new Scanner(System.in);
      System.out.println("Enter the no.of rows");
      int n=scanner.nextInt();
      int mid=(n+1)/2;
     // System.out.println(mid);
      AtomicInteger sp=new AtomicInteger(mid-1);
      AtomicInteger st=new AtomicInteger(1);
      IntStream.rangeClosed(1, n).forEach(row->{
    	  IntStream.rangeClosed(1,sp.get()).forEach(x->{
    		  System.out.print("  ");
    	  });
    	  IntStream.rangeClosed(1,st.get()).forEach(col->{
    		 System.out.print(row+" "); 
    	  });
    	  if(row<mid) {
    		    st.incrementAndGet();
    		  sp.decrementAndGet();
    	  }else {
    		  st.decrementAndGet();
    		  sp.incrementAndGet();
    	  }
    	  	System.out.println();
      });
	}

}
