package acces.mod.pack1;

public class Class1 {

//  Access modifiers = set of keyword use to control access of java
//  element/proprty(class , method , data)

//	1.public   ==> access throughout the package
//	2.protected  ==>access within the packages or child classes
//	3.default  ==> within the package
//	4.private  ==> within the class

	
	//public
	public String name = "Ramesh";  //Public
	
	public void mOne() {
		System.out.println("Public");
	}
	
	
	// protected
	protected String id = "adhaar";
	protected void adhaar() {
		System.out.println("737848939457");
	}
	
	
	//default
	
	String add = "Pune";
	
	void add() {
		System.out.println("Maharashtra");
	}
	
	//Private
	private String Country = "India ";
	private void country() {
		System.out.println("India");
	}
	
	public static void main(String[] args) {

		Class1 obj = new Class1();
		System.out.println("Class1");
		System.out.println(obj.name);
		obj.mOne();
		System.out.println(obj.id);
		obj.adhaar();
	}

}
