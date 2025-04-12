package language.basics;

public class ClassAndObject3 extends ClassesAndObject1 {

	public static void main(String[] args) {

		ClassesAndObject1 obj = new ClassesAndObject1();
		System.out.println(obj.name);
		System.out.println(obj.id);
		System.out.println(obj.visaStatus);

	}

}


// public class ClassesAndObject1 extends ClassesAndObject3
// then it is cyclic inheritance 