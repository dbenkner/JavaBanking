package benkner.bankingv1;
import benkner.bankingv1.Checking;
import benkner.bankingv1.Savings;

public class Program {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Savings account1 = new Savings("Savings");
		Checking account2 = new Checking();
		int i = 0;
		try {
			account1.Deposit(50);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(account1.toString());
		account2.Deposit(200);
		System.out.println(account2.toString());
		account2.Withdraw(50);
		System.out.println(account2.toString());
		account1.Transfer(20, account2);
		System.out.println(account1.toString());
		System.out.println(account2.toString());
		account1.calculateInterestByMonths(12);
		System.out.println(account1.toString());
		account2.WriteCheck(20);
		System.out.println(account2.toString());
		account2.WriteCheck(10);
		System.out.println(account2.toString());
		System.out.println(account1.dateCreated);
	}

}
