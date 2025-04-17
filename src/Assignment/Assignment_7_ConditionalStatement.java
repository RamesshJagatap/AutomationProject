package Assignment;

public class Assignment_7_ConditionalStatement {

	public static void main(String[] args) {

		String customerName = "John Doe";
		int creditScore = 720;
		float income = 55000.0f;
		boolean isEmployed = true;
		float debtToIncomeRatio = 35.0f;

//		1.CreditScore 

		if (creditScore > 750) {
			System.out.println("Eligible for loan");
		}

		else if (creditScore >= 650 && creditScore <= 750) {
			System.out.println("Additional checks performing...");
		} else if (creditScore < 650) {
			System.out.println("Loan denied");
		}

//	    2.Income

		if (creditScore >= 650 && creditScore <= 750) {
			System.out.println(income);
		}

//		3. Employment Status:

		if (income >= 50000) {

			if (isEmployed) {
				System.out.println(customerName + " is Employed");
				if (debtToIncomeRatio < 40) {
					System.out.println("Loan Approved : Yes");
				} else {
					System.out.println("Loan Denied");

				}
//				System.out.println("Customer employed");
			}

			else {
				System.out.println("Customer Unemployed");
			}

		}

	}

}
