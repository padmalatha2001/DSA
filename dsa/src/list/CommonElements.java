package list;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l1=List.of(2, 5, 5, 7, 8);
		List<Integer> l2=List.of(1, 2, 3, 5, 9);
		
		Set<Integer> set=new LinkedHashSet<>(l1);
		List<Integer> common=new ArrayList();
		for(Integer k:l2) {
			if(set.contains(k)) {
				common.add(k);
			}
		}
		common.stream().forEach(e->System.out.print(e+" "));
	}

}
