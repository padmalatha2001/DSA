package patterns;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
class Practice{
	public static void main(String[] args) {
		String str="Core nuts technologies located in Banglore Core nuts technologies located in Hyderabad Core nuts technologies in hyderabad Core nuts technologies in Banglore";
		String[] arr=str.split(" ");
		Map<String,Long> map=Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	     map.entrySet().forEach(System.out::println);
	   for(Map.Entry<String, Long> entry:map.entrySet()) {
		   
	   }
	}
}
