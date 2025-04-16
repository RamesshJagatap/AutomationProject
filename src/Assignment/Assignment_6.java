package Assignment;

public class Assignment_6 {

	public static void main(String[] args) {

		int a, b, c;
		String[] StudentNames = { "Suresh", "Mahesh", "Naresh" };
		int[] Marks = { 75, 80, 82 };
		a = Marks[0] += 10;
//		System.out.println(a);
		b = Marks[1] += 10;
		c = Marks[2] += 10;

		System.out.println("Updated Marks :");
		System.out.println(StudentNames[0] + ":" + a);
		System.out.println(StudentNames[1] + ":" + b);
		System.out.println(StudentNames[2] + ":" + c);

		int AvarageMarks = (a + b + c) / 3;
		System.out.println("Avarage Marks : " + AvarageMarks);

	}

}
