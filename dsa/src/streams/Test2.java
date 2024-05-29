package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test2 {
	
	public static List<Transaction> getList(){
		List<Transaction> list=new ArrayList();
		list.add(new Transaction(1,11,2000,2024));
		list.add(new Transaction(2,12,3500,2023));
		list.add(new Transaction(3,13,2800,2023));
		list.add(new Transaction(4,14,3200,2024));
		list.add(new Transaction(5,15,1080,2023));
		list.add(new Transaction(6,11,3425,2022));
		list.add(new Transaction(7,11,3245,2024));
		list.add(new Transaction(8,12,2890,2023));
		list.add(new Transaction(9,13,2189,2023));
		list.add(new Transaction(10,14,3567,2023));
		list.add(new Transaction(11,15,3456,2023));
		
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Test2 test=new Test2();
        List<Transaction> list= test.getList();
        
        list.stream().filter(ts->ts.getYear()>=2023).collect(Collectors.groupingBy(Transaction::getUid,Collectors.averagingDouble(Transaction::getAmount)))
        .entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(3).forEach(entry->{
        	System.out.print(entry.getKey()+" : "+entry.getValue());
        	System.out.println();
        });
	}

}
