package Assignment;

public class Assignment_7_NestedCondition {

	public static void main(String[] args) {

		String customerName = "John Doe";
		int creditScore = 720;
		float income = 55000.0f;
		boolean isEmployed = true;
		float debtToIncomeRatio = 35.0f;

		if (creditScore > 750) {
			System.out.println("Loan Approved");
		} else if (creditScore >= 650 && creditScore <= 750) {
			if (income >= 50000) {
				if (isEmployed) {
					if (debtToIncomeRatio < 40) {
						System.out.println("Loan Approved :Meets All the Criteria ");
					} else {
						System.out.println("Loan  Not Approved :debtToIncomeRatio is Less");
					}

				} else {
					System.out.println("Loan  Not Approved : User not Employed");
				}
			}
		} else {
			System.out.println("Loan  Not Approved : Additional checks performed");
		}
	}

}
