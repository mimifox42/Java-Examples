import java.util.Scanner;
import java.util.Date;
public class Exercise10_07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    Account[] acc = new Account[10];
    startingValue(acc);
		do {
			System.out.print("Enter an id: ");
			int id = in.nextInt();

			if (isValid(id, acc)) {
				int options;
				do {	
					options = displayMainMenu(in);
					if (choices(options)) {
							run(options, acc, id, in);
					}
				} while (options != 4); 
			}
		} while (true); 
	}
	public static void startingValue(Account[] a) {
		int startingVal = 100;
		for (int i = 0; i < a.length; i++) {
			a[i] = new Account(i, startingVal);
		}
	}
	public static boolean choices(int i) {
		return i > 0 && i < 4;
	}
	public static boolean isValid(int id, Account[] a) {
		for (int i = 0; i < a.length; i++) {
			if (id == a[i].getId())
				return true;
		}
		return false;
	}

	public static int displayMainMenu(Scanner in) {
		System.out.print(
			"\nMain menu\n1: check balance\n2: withdraw" +
			"\n3: deposit\n4: exit\nEnter a choice: ");
		return in.nextInt();
	}
	public static void run(
		int c, Account[] a, int id, Scanner in) {
		switch (c) {
			case 1: 
					  System.out.println("The balance is " + a[id].getBalance());
					  break;
			case 2: 
					  System.out.print("Enter an amount to withdraw: "); 
					  a[id].withdraw(in.nextDouble());
					  break;
			case 3:
					  System.out.print("Enter an amount to deposit: "); 
					  a[id].deposit(in.nextDouble());
		}
	}
}
