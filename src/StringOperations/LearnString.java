package StringOperations;

public class LearnString {

	public static void main(String[] args) {
		
		
		//String ==> immutable we cannot change 
		//stringBuffer ==>   synchronised (one thread at a time) we can change
		//StringBuoilder ===> non synchronised 
		String name = "Ramesh";
		name.concat("jagtap");
		System.out.println(name);    //values is not concatinating gives original val
		
		//StringBuffer
		StringBuffer bf = new StringBuffer("Ramesh");
		bf.append("Jagtap");
		System.out.println(bf);     //gives new updated value
		
		//StringBuilder
		StringBuilder bd = new StringBuilder("Ramesh");
		bd.append(" is Software Tester");
		System.out.println(bd);
		
	}}
