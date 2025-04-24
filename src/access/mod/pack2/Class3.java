package access.mod.pack2;

import acces.mod.pack1.Class1;

public class Class3 extends Class1 {

	public static void main(String[] args) {
		Class1 obj = new Class1();
		System.out.println(obj.name);
		obj.mOne();
		Class3 obj1 = new Class3();
		System.out.println(obj1.id);
		obj1.adhaar();
		
	}

}
