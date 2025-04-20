package Assignment;

import java.util.ArrayList;
import java.util.List;

public class Assignment_8_Loops {

	public static void main(String[] args) {

		int count = 0;
		int sum = 0;
		int CreditCount = 0;
		int DebitCount = 0;
		int CreditAmount = 0;
		int DebitedAmount = 0;
		int SuspeciousCredit = 0;
		int SCC = 0;
		int SDC = 0;
		int SuspeciousDebit = 0;

		List<Integer> Transactions = new ArrayList<Integer>();
		Transactions.add(50000);
		Transactions.add(-2000);
		Transactions.add(3000);
		Transactions.add(-15000);
		Transactions.add(-200);
		Transactions.add(-300);
		Transactions.add(4000);
		Transactions.add(-3000);
		System.out.println(Transactions);

		for (int i = 1; i <= Transactions.size(); i++) {
			count = count + 1;
		}
		System.out.println("All the transactions Done :" + count);

//		System.out.println(Transactions.get(1));

//		for (int i = 0; i < Transactions.size(); i++) {
//			System.out.println(Transactions.get(i));
//			int  a = Transactions.get(i);
//			a = a++;
//			System.out.println(a);
//		if(Transactions.add(i) > 0) {
//			
//		}

	
//			if(amount > 10000 && amount <(-10000) ) {	
//			System.out.println("suspecious ");
//			
//			if(CreditAmount > 1000  && DebitedAmount <(-10000) ) {
//				
//				System.out.println("Suspecious Account Activity");
//				System.out.println();
//			}
//			else {
//				System.out.println("Smooth Transaction");
//			}

			
			
//			1. Print total number of credit and debit transactions completed
//		    2. Print the total amount credited and debited in account
		for (Integer amount : Transactions) {
			if (amount > 0) {
				CreditCount = CreditCount + 1;
				CreditAmount = CreditAmount + amount;

			}
			if (amount < 0) {
				DebitCount = DebitCount + 1;
				DebitedAmount = DebitedAmount + amount;
			}

		}
		
//		4. If any transaction limit exceeds +/- 10000 then print the message “Suspicious credit/ debit
//		Transaction with Amount” and also print total number of suspicious transactions
		
		for (Integer amount : Transactions) {
			if (amount > 10000) {
				SCC += 1;
				SuspeciousCredit += amount;
			}
	
			if (amount < (-10000)) {
				SDC += 1;
				SuspeciousDebit += amount;
			}

		}

		System.out.println();
		System.out.println("Number Of Credit Transactions:" + CreditCount);
		System.out.println("Credited Amount :" + CreditAmount + "Rs");

		System.out.println();
		System.out.println("Number Of Debit Transactions:" + DebitCount);
		System.out.println("Debited Amount :" + DebitedAmount + "Rs");
		System.out.println();
		
		
//		3. Print total amount remaining at the end in Bank Account
		
		int totalAmount = CreditAmount + DebitedAmount;
		System.out.println("Available Balance/Total :" + totalAmount + "Rs");
		System.out.println();

		System.out.println("Suspecious Credit Amount:" + SuspeciousCredit);
		System.out.println("Suspecious Credit Count:" + SCC);
		System.out.println();
		
		System.out.println("Suspecious Debit Amount:" + SuspeciousDebit);
		System.out.println("Suspecious Debit Count:" + SDC);
	}
}
