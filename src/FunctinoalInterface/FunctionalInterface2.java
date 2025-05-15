package FunctinoalInterface;

public class FunctionalInterface2 implements FunctionalInterface1 {

	public static void main(String[] args) {

		FunctionalInterface1 fi = (a, b) -> a + b;   //lambada expression
		System.out.println(fi.sum(3, 6));

	}

	@Override
	public int sum(int a, int b) {
		return a + b;
	}

}
