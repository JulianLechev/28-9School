package pack;

public class AccountTest {

	public static void main(String[] args) {
		
		Account acc = new Account();
		acc.setId(1122);
		acc.setBalance(20000);
		acc.setYearInterestRate(4.5);
		acc.withdraw(2500);
		acc.deposit(3000);
		
		System.out.println("The balance is " + acc.getBalance() + ". The mothly interest rate is " + acc.getMonthlyInterest() + ". On " + acc.dateCreated  );

	}

}
