package Assignment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Assignment4_LargestCities {

	public static void main(String[] args) {
		List<String> CityNames = new ArrayList<String>();
		CityNames.add("Delhi");
		CityNames.add("Bengaluru");
		CityNames.add("Visakhapatnam");
		CityNames.add("Hyderabad");
		CityNames.add("Lucknow");
		
		System.out.println("City Names : "+ CityNames);
		
		List<Integer> CityAreas = new LinkedList<Integer>();
		CityAreas.add(1484);
		CityAreas.add(741);
		CityAreas.add(681);
		CityAreas.add(650);
		CityAreas.add(631);
		CityAreas.add(3,300);
		CityAreas.remove(1);
		
		
		System.out.println("Total area of Third and Fourth City :" + (CityAreas.get(2)+ CityAreas.get(3)) + "km²");

	}

}
