package pack;

import java.util.Scanner;

public class AccTest16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account[] accs = new Account[10];
		for (int i = 0; i < 10; i++) {
			accs[i] = new Account();
			accs[i].setId(i);
			
			
		}
		int selectedAction = 0;
		while (1 < 2) {
			System.out.println("Enter an ID");
			int selectedId = sc.nextInt();
			for (int i = 0; i < 10; i++) {
				if (accs[i].getId() == selectedId) {
					while(selectedAction != 4) {
					System.out.println("Choose an action\n 1. Balance\n 2. Withdraw\n 3. Deposit\n 4. Exit");
					selectedAction = sc.nextInt();
					switch (selectedAction) {
					case 1:
						System.out.println(accs[i].getBalance());
						break;
					case 2:
						System.out.println("Withdrawn amount: ");
						int WA = sc.nextInt();
						accs[i].withdraw(WA);
						System.out.println(accs[i].getBalance());
						break;
					case 3:
						System.out.println("Deposited amount: ");
						int DA = sc.nextInt();
						accs[i].deposit(DA);
						System.out.println(accs[i].getBalance());
						break;
					default:
						break;
						
					}
					}
				}

			}
		}
	}
}