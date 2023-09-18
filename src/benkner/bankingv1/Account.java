package benkner.bankingv1;

import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Account {
	public static String routingNumber = "123 456 789";
	public static int nextAccountNo = 1;
	public int accountNo;
	public double Balance;
	public String description;
	public LocalDate dateCreated = java.time.LocalDate.now();

	public Account() {

	}
	public Account(String str) {
		setDescription(str);
		setAccountNo(nextAccountNo++);
		setBalance(0);
	}
	public boolean Deposit(double amount) throws Exception  {
		if (amount <= 0) {
			throw new Exception("Amount must be greater than 0!");
		}
		setBalance(getBalance() + amount);
		return true;
	}
	public boolean Withdraw(double amount) throws Exception{
		if (amount <= 0) {
			throw new Exception("Amount must be greater than 0!");
		}
		if (Balance < amount) {
			throw new Exception("Insufficient Funds!");
		}
		setBalance(getBalance() - amount);
		return true;
	}
	public boolean Transfer(double Amount, Account ToAccount) throws Exception
	{
		if (this.Withdraw(Amount) == true)
		{
			ToAccount.Deposit(Amount);
			return true;
		}
		System.out.println("Transfer failed");
		return false;
	}
	// Getters / Setters
	public int getAccountNo() {
		return accountNo;
	}
	protected void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public double getBalance() {
		return Balance;
	}
	protected void setBalance(double balance) {
		Balance = balance;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(LocalDate dateCreated) {
		this.dateCreated = dateCreated;
	}
}
	
