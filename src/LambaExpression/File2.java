package LambaExpression;

public class File2 {   // without implementation lambada expressdion woriing

	public static void main(String[] args) {
	
		FunctionalInterface1 fi = (a ,b)-> a* b;
		System.out.println(fi.mult(5, 6));
		
	}

}
