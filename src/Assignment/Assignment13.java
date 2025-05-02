package Assignment;

import java.util.Scanner;

public class Assignment13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of your choice");
		int n = scan.nextInt();
		boolean isPrime;
		int i = 2;

		for (int a = 2; a <= n; a++) {
			isPrime = true;
			if (n % i == 0 && n % n == 0) {
				isPrime = false;
				break;
			}
			if(isPrime=true ) {
				System.out.println("prime");
			}
			else {
				System.out.println("not prime");
			}

		}
		

	}

}
