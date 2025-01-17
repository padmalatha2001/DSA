package patterns;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scanner=new Scanner(System.in);
       System.out.println("Enter no.of rows");
       int n=scanner.nextInt();
       int mid=(n/2)+1;
      
       AtomicInteger k=new AtomicInteger(mid);
       IntStream.rangeClosed(1, n).forEach(row->{
    	   if(row<=mid)
    	    {
    		   IntStream.rangeClosed(1,row).forEach(col->{
    	       
    		  System.out.print("* "); 
    	   });
    	   
    	 }else {
    		 k.decrementAndGet();
    		 IntStream.rangeClosed(1,k.get()).forEach(col->{
    			System.out.print("* "); 
    		 });
    	 }
    	   System.out.println();
       });
	}

}
