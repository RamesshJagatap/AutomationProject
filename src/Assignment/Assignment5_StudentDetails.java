package Assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment5_StudentDetails {

	public static void main(String[] args) {

		
		// to keep the insertion order I have used LinkedHashMap
		// earlier I have used hashmap only then it store values randomly
		
		
	Map<String,String> row1 = new  LinkedHashMap<String,String>();
	row1.put("Name","John Doe");
	row1.put("Age","20");
	row1.put("Gender","Male");
	row1.put("Roll Number","S12345");
	row1.put("Grade ","A");
	row1.put("Major","Computer");
	row1.put("GPA","3.8");
	row1.put("Email","John@example.com");
	row1.put("Contact","1234567890");
	row1.put("Addess","123 Elm St");
	
	Map<String,String> row2 = new  LinkedHashMap<String,String>();
	row2.put("Name","Jane Smith");
	row2.put("Age","21");
	row2.put("Gender","Female");
	row2.put("Roll Number","S12346");
	row2.put("Grade ","B");
	row2.put("Major","Mathematics");
	row2.put("GPA","3.5");
	row2.put("Email","Jane@example.com");
	row2.put("Contact","0987654321");
	row2.put("Addess","456 Oak Stt");
	
	Map<String,String> row3 = new  LinkedHashMap<String,String>();
	row3.put("Name","Mike Brown");
	row3.put("Age","22");
	row3.put("Gender","Male");
	row3.put("Roll Number","S12347");
	row3.put("Grade ","A ");
	row3.put("Major","Physics");
	row3.put("GPA","3.9");
	row3.put("Email","Mike@example.com");
	row3.put("Contact","0987658721");
	row3.put("Addess","789 Pine St");
	
	
	List<Map<String,String>> StudentList = new ArrayList<Map<String,String>>();
	
	StudentList.add(row1);
	StudentList.add(row2);
	StudentList.add(row3);
	
	System.out.println(StudentList);
	

	}

}
