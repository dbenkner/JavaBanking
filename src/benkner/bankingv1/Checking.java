package benkner.bankingv1;

public class Checking extends Account {
	private static int nextCheckNo = 100;
	public int checkNo;
	public Checking() {
		super();
	}

	public boolean WriteCheck (double amount) throws Exception {
		if(Withdraw(amount) == false) {
			return false;
		}
		setCheckNo(nextCheckNo++);
		System.out.println(checkNo);
		return true;
	}

	public int getCheckNo() {
		return checkNo;
	}

	public void setCheckNo(int checkNo) {
		this.checkNo = checkNo;
	}
	public String toString()	
	{
		return String.format("%d|%s|%.02f|%d ", getAccountNo(), getDescription(), getBalance(), getCheckNo());
	}
}
