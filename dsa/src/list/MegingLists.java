package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MegingLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
       List li=Arrays.asList(1,3,6,7);
       List l1=Arrays.asList(2,4,5);
        int i=0,j=0;
       List<Integer> merge=new ArrayList<>();
       while(i<li.size()&&j<l1.size()) {
    	   if((int)li.get(i)<(int)l1.get(j))
    	   {
    		   merge.add((int)li.get(i));
    		   i++;
    	   }
    	   else
    	   {
    		   merge.add((int)l1.get(j));
    		   j++;
    	   }
       }
       while(i<li.size()) {
    	   merge.add((int)li.get(i));
    	   i++;
       }
       while(j<l1.size()) {
    	   merge.add((int)l1.get(j));
    	   j++;
       }
       merge.stream().forEach(e->{
    	   System.out.print(e+" ");
       });
      
	}

}
