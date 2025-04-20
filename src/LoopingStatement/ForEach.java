package LoopingStatement;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ForEach {

	public static void main(String[] args) {

		String[] EmpNames = { "Ramesh", "Ganesh", "Mahesh", "Suresh" };
		for (String s : EmpNames) {
			System.out.println(s);
		}
		
		List<Integer> num = new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		num.add(8);

		for(Integer a :num) {
			System.out.println(a);
		}
		}

	}


