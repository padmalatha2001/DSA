package patterns;

import java.util.stream.IntStream;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int rows=8;
//	    IntStream.rangeClosed(1, rows).mapToObj(row->"*".repeat(rows-row+1)).forEach(System.out::println);
	
	   String str="Corenuts";
	   int length=str.length();
	   IntStream.rangeClosed(1, length).mapToObj(i->str.substring(0, i)).forEach(System.out::println);
	}

}
