package acces.mod.pack1;

public class Class2 {

	public static void main(String[] args) {
		
		Class1 obj = new Class1();
		System.out.println("Class2");
		System.out.println(obj.name);
		obj.mOne();
		
		System.out.println(obj.id);
		obj.adhaar();
		System.out.println(obj.getCity());
		obj.state();
		
		
	}

}
