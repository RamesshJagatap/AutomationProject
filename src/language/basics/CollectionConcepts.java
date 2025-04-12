package language.basics;

import java.util.ArrayList;
import java.util.List;

public class CollectionConcepts {

	public static void main(String[] args) {

		/*
		 * Advantages of Collection over Array
		 *  1.collections are dynamic in size no need
		 *  to declare size on starting 
		 * 2.memory allocated dynamically 3.collection
		 * allows different data types in same data structure 4.modifications are also
		 * allowed
		 */

		// Major collection category
		// 1.List     2.Set     3.Map
		

		// List ==> ArrayList , LinkedList
		
		//1. List can store multiple values with similar datatype and allowcate memeory dynamically 
		//2.List allow duplicate values
		//3.List allow modification
		//4.dynamic memory allocation
		
		//Set ==> Hashset , LinkedHashSet , TreeSet
		
		//1. Set can store multiple values with similar datatype and allowcate memeory dynamically 
		//2.List not duplicate values
		//3.List allow modification
		//4.dynamic memory allocation
		
		//Map ==> HashMap , LinkedHashMap , Hashtable
		
		//1.Allows modification 
		//2.won't allow duplicate keys but allow duplicate values
		//3.dynamic memory
		
		
		
		//ArrayList will store values in contageous memory like array
		List<String> empStringList = new ArrayList<String>();
		empStringList.add("Ramesh");
		empStringList.add("somesh");
		empStringList.add("Rahul");
		empStringList.add("Suresh");
		empStringList.add("Lokesh");
		empStringList.remove("Ramesh");
		empStringList.add("null");
		empStringList.add(4,"Vaishnavi");
		System.out.println( empStringList.size());
		System.out.println(empStringList);



		
	}

}
