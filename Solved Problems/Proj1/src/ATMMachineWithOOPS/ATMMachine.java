package ATMMachineWithOOPS;
import java.util.Scanner;

class ATM {
	float Balance;
	int PIN = 6789;
	
	public void checkPin(){
		System.out.println("Please enter your PIN: ");
		Scanner s = new Scanner(System.in);
		int enteredPin = s.nextInt();
		if(enteredPin == PIN) {
			menu();
		}else {
			System.out.println("Enter a valid PIN: ");
			int enteredPin1 = s.nextInt();
			if(enteredPin1 == PIN) {
				menu();
			}
		}
	}
	
	public void menu() {
		System.out.println("Enter your choice: ");
		System.out.println("1. Check A/C Balance");
		System.out.println("2. Withdrawl Money");
		System.out.println("3. Deposit Money");
		System.out.println("4. EXIT");
		
		Scanner s = new Scanner(System.in);
		int opt = s.nextInt();
		if(opt == 1) {
			checkBalance();
		}else if(opt == 2) {
			withdrawlMoney();
		}else if(opt == 3) {
			depositMoney();
		}else if(opt == 4) {
			return;
		}else {
		System.out.println("Enter a valid choice");
		}
	}
	public void checkBalance() {
		System.out.println("Balance: "+ Balance);
		menu();
	}
	
	public void withdrawlMoney() {
		System.out.println("Please Enter Amount to Withdrawl: ");
		Scanner s = new Scanner(System.in);
		float amount = s.nextInt();
		if(amount > Balance) {
			System.out.println("Insufficient Balance");
		}else {
			Balance = Balance-amount;
			System.out.println("Money Withdrawl Successful");
		}
		menu();
	}
	public void depositMoney() {
		System.out.println("Please Enter Amount: ");
		Scanner s = new Scanner(System.in);
		float amount = s.nextInt();
		Balance = Balance + amount;
		System.out.println("Money Deposit Successfully");
		menu();
	}
}

public class ATMMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM obj = new ATM();
		obj.checkPin();
	}

}
