package pack;
import java.util.Date;

public class Account {

	private int id = 0;
	private double balance = 0;
	private static double yearInterestRate = 0;
	Date dateCreated = new Date();
	
	public Account(){
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static double getYearInterestRate() {
		return yearInterestRate;
	}

	public static void setYearInterestRate(double yearInterestRate) {
		Account.yearInterestRate = yearInterestRate;
	}
	
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		
	}
	
	public double  getMonthlyInterestRate () {
		return getYearInterestRate()/12;
	}
	public String getMonthlyInterest() {
		return Double.toString(balance* (getMonthlyInterestRate() / 100));
	}
	public void withdraw(int withdrawn) {
		balance = balance - withdrawn;
	}
	public void deposit(int deposited) {
		balance = balance + deposited;
	}
	
}
