package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List li=Arrays.asList(1,2,3,4,3,1,2);
      ArrayList<Integer> ne=new ArrayList<>();
      for(Object ele:li) {
    	  if(!ne.contains(ele))
    	  {
    		  ne.add((int)ele);
    	  }
      }
		ne.stream().forEach(e->System.out.print(e+" "));
		
	}

}
