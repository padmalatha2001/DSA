package patterns;

import java.util.stream.IntStream;
import java.util.*;
public class Pattern2 {

	public static void main(String[] args) {
		
		 Scanner scanner=new Scanner(System.in);
		 System.out.println("No of rows to print prime pattern");
		 int n=scanner.nextInt();
		 int[][] primes=getPrimes(n);
//		 Arrays.stream(primes).forEach(row->{
//			 Arrays.stream(row).forEach(ele->{
//				System.out.print(ele+" "); 
//			 });
//			 System.out.println();
//		 });
		 
		 IntStream.range(1, 5).forEach(row->{
			 IntStream.range(1,5-row).forEach(k->{
				System.out.print("  "); 
			 });
			 IntStream.rangeClosed(1, row).forEach(k->{
				System.out.print(primes[row-1][k-1]+" "); 
			 });
			 System.out.println();
		 });
	}

	private static int[][] getPrimes(int n){
		int[][] primes=new int[n][];
		int currentPrime=2;
		for(int i=0;i<n;i++) {
			  primes[i]=new int[i+1];
			for(int j=0;j<=i;j++) {
				primes[i][j]=currentPrime;
				currentPrime=getNextPrime(currentPrime);
			}
		}
		return primes;
	}
	private static int getNextPrime(int currentPrime) {
		// TODO Auto-generated method stub
		int k=++currentPrime;
		boolean f=true;
		while(f) {
			int c=0;
		  for(int i=2;i<=Math.sqrt(k);i++)
		  {
			if(k%i==0)
				c++;
		  }
		  if(c==0) {
			  f=false; 
		  }
		  else
			 k++;
		}
		 return k;
	}
}
