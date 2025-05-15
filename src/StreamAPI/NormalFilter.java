package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NormalFilter {

	public static void main(String[] args) {
		
//		
//		List<Integer> List = new ArrayList<Integer>();
//		List.add(1);
//		List.add(3);
//		
		List<Integer> list = List.of(1,3,9,13,46,94);
		List<Integer> evenNumbers = list.stream().filter(x ->%2==0).collect(Collectors.toList());
				
	}

}
