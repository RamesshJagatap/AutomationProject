package Assignment;



public class Assignment15_17 {
	
	//Count of java words
	public static void assignment16() {
		String paragraph = "Java is a popular programming language. Java is used for web development, mobile applications, and more.";
		String[] s = paragraph.split(" ");
		for (int i = 0; i <= paragraph.length() - 1; i++) {
			
			}	
		}
			public static void TrianglePattern() {
				for(int i = 0;i<5;i++) {
					for(int j=5;j>i;j--) {
						System.out.print("-");
					}
					System.out.println();
				}
				for(int i = 0;i<5;i++) {
					for(int j=0;j<=i;j++) {
						System.out.println("*");
						
					}
					System.out.println();
				}
			}
				
	
	

	public static void main(String[] args) {
		String sentence = "Java programming is fun and challenging";
		System.out.println("Length of String : " + sentence.length());

		// for reverse
		String reverse = "";
		for (int i = sentence.length() - 1; i >= 0; i--) {
			reverse = reverse + sentence.charAt(i);
		}
		
		System.out.println(reverse);
		System.out.println();
		
		
		//FOr capital
		String[] s = sentence.split(" ");
		for (int i = 0; i <= s.length - 1; i++) {
		    String cap = s[i].substring(0, 1).toUpperCase() + s[i].substring(1);
		    System.out.print(cap + " ");
		}
		Assignment15_17.assignment16();
		System.out.println();
		System.out.println("Triangle");
		Assignment15_17.TrianglePattern();

	}
	

}
