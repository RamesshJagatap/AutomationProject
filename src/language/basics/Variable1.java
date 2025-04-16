package language.basics;

public class Variable1 {
 
	static int a = 10;   //static var
	int b = 5;           //non static var 
	
	public static void main(String[] args) {
		
		int c = 4;       //Local var
		
		System.out.println(c);
		System.out.println(a);
		System.out.println( new Variable1().b);
		

	}

}
