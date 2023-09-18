package benkner.bankingv1;

public class Savings extends Account {
	private double interestRate = 0.12;
	public Savings()
	{
		super();
	}
	public Savings(String str)
	{
		super(str);
	}
	public double getInterestRate(){
		return interestRate;
	}
	public void setInterestrate(double cusInterestRate) {
		interestRate = cusInterestRate;
	}
	public void calculateInterestByMonths(int months) throws Exception { 
		double interest = Balance * (interestRate /12) * months;
		Deposit(interest);
	}
	public String toString()	
	{
		return String.format("%d|%s|%.02f|%.03f ", getAccountNo(), getDescription(), getBalance(), getInterestRate());
	}
}
