package patterns;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scanner=new Scanner(System.in);
       System.out.println("Enter no.of rows");
       int n=scanner.nextInt();
       AtomicInteger sp=new AtomicInteger(0);
       
       IntStream.rangeClosed(1, n).forEach(row->{
    	   IntStream.rangeClosed(1, sp.get()).forEach(x->{
    		  System.out.print(" ");  
    	   });
    	   IntStream.rangeClosed(1,n-row+1).forEach(col->{
    		  System.out.print("* "); 
    	   });
    	   System.out.println();
    	   sp.incrementAndGet();
       });
	}

}
