package patterns;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scanner=new Scanner(System.in);
       System.out.println("Enter no.of rows");
       int n =scanner.nextInt();
    //   AtomicInteger sp=new AtomicInteger(n*2-1);
       
//       IntStream.rangeClosed(1, n).forEach(row->{
//    	   IntStream.rangeClosed(1, sp.get()).forEach(e->System.out.print(" "));
//    	   AtomicInteger v=new AtomicInteger(row);
//    	
//    	   IntStream.rangeClosed(1,2*row-1).forEach(col->{
//    		   
//    		   if(col<row)
//    		   {
//    			   System.out.print(v+" ");
//        		   v.decrementAndGet(); 
//    		   }else {
//    			   System.out.print(v+" ");
//    			   v.incrementAndGet();
//    		   }
//    		   
//    		   
//    		   });
//    	   sp.decrementAndGet();
//    	   sp.decrementAndGet();
//    	   System.out.println();
//       });
       
       AtomicInteger sp=new AtomicInteger(0);
       AtomicInteger ro=new AtomicInteger(2*n-1);
       IntStream.rangeClosed(1, n).forEach(row->{
    	  IntStream.rangeClosed(1,sp.get()).forEach(x->{
    		 System.out.print("  "); 
    	  });
    	   
    	  IntStream.rangeClosed(1,ro.get()).forEach(col->{
    		  System.out.print("* ");
    	  });
    	  ro.decrementAndGet();
    	  ro.decrementAndGet();
    	  System.out.println();
    	  sp.incrementAndGet();
       });
	}

}
