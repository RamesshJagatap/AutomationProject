package MethodsInJava;

public class ScopeOfMethods {

	void Mone() {
		System.out.println("mOne");
		int i = 5;
	}

	static {
		System.out.println("Static block");
	}

	static void Mtwo() {

		System.out.println("Mtwo");
	}

	public static void main(String[] args) {

		ScopeOfMethods scope = new ScopeOfMethods();

		Mtwo();
		scope.Mone();
		System.out.println();
	}

}
