package Assignment;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment4_Attraction {

	public static void main(String[] args) {
		String a;

		// for set we want to store in order then we have to use LinkedHashSet(fast
		// execution and keeps order) and TreeSet(not stored null)
		// Set does not allow duplicate

		Set<String> attraction = new LinkedHashSet<String>();
		attraction.add("Great Wall of China, China");
		attraction.add("Statue of Liberty, USA");
		attraction.add("Colosseum, Italy");
		attraction.add("Christ the Redeemer, Brazil");
		attraction.add("Louvre Museum, France");
		attraction.add("Times Square, USA");
		attraction.add("Burj Khalifa, UAE");
		attraction.add("Tokyo Disneyland, Japan");
		attraction.add("Big Ben, United Kingdom");
		attraction.add("Sagrada Familia, Spain");
		attraction.add("Acropolis of Athens, Greece");

//		System.out.println(attraction);

		// cannot use for loop coz set doesn't have indexes then how can we iterate
		// for collection framework we use iterator to iterate

		Iterator<String> it = attraction.iterator();
		while (it.hasNext()) {
			String name = it.next();
			System.out.println(" - " + name);
		}
		System.out.println("Total Attractions : " + attraction.size());

	}
//	for(it.hasNext();a=it.Next()) {
//		System.out.println(a);
//	}

}
