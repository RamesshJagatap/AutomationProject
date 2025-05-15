package StreamAPI;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMapping {

	public static void main(String[] args) {
		
		List<Integer> list = List.of(1,3,4,6,74,6,6,7,2,89,54,6);
		
		//Distinct order
		
		List<Integer> distinctorderList = list.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(distinctorderList);
		
		//Reverse Order
		
		List<Integer> DistinctReverseOrder = list.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(DistinctReverseOrder);
	}

}
