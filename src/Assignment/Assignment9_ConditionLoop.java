package Assignment;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Assignment9_ConditionLoop {
	
	int Srno ;
	String name ;
	double exp;
	double rating;
	static double sal;
	
	Assignment9_ConditionLoop( int Srno,String name , double exp, double rating , double sal){
		this.exp=exp;
		this.name = name;
		this.rating=rating;
		this.sal=sal;
		this.Srno=Srno;
	}

	public static void main(String[] args) {
		
//		Map<String,Integer> EmployeeTable = new LinkedHashMap<String,Integer>();
		
		List<Assignment9_ConditionLoop> EmployeeTable =new ArrayList<Assignment9_ConditionLoop>();
		
		EmployeeTable.add(new Assignment9_ConditionLoop(1,"Alice jhonson",75000,5.1,4.2));
		EmployeeTable.add(new Assignment9_ConditionLoop(2,"Bob Smith",68000,3.2,3.8));
		EmployeeTable.add(new Assignment9_ConditionLoop(3,"Carol Davis",82000.0,7.1,4.5));
		EmployeeTable.add(new Assignment9_ConditionLoop(4,"David Brown",90000.0,10.2,2.5));
		EmployeeTable.add(new Assignment9_ConditionLoop(5,"Eva Green",60000.0,2.4,3.5));

		System.out.println(EmployeeTable);
		
		for( Assignment9_ConditionLoop table :EmployeeTable) {
			
		
			if(table.rating>=4.2) {
				sal = sal + 10/100;
				int bonus = 1500;
				System.out.println(table.name);
			}
			else if(table.rating >=3.0 && table.rating<4.0){
				sal = sal + 10/100;
				int bonus = 1200;
			}
			else if (table.rating < 3.0) {
				sal = sal + 3/100;
				int bonus = 300;
			}
		}
		

	}

}
