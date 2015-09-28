class Account {
	int number;
	String client;
	double balance = 100; //start new account with 100 deposited
	double limit;

	void deposit(double value) {
		this.balance += value;
	}

	boolean take(double value) {
		if (this.balance < value) {
			return false;
		}
		else {
			this.balance = this.balance - value;
			return true;
		}
	}

	boolean transferFor(Account destiny, double value) {
		if (this.take(value) == false) {
			return false;
		}
		else {
			destiny.deposit(value);
			return true;
		}
	}
}

class MyProgram {
	public static void main(String[] args) {
		// create my account
		Account myAccount = new Account();

		// change default values of my account
		myAccount.client = "Marcelo";
		myAccount.balance += 1000.0;

		// take money (200.00)
		if (myAccount.take(2000)) {
			System.out.println("Take Sucess!");
		}
		else {
			System.out.println("Don't take");
		}

		// deposit more money(500)
		myAccount.deposit(500);

		// transfer value for other account
		Account otherAccount = new Account();
		otherAccount.client = "Other";
		otherAccount.balance += 0.0;

		myAccount.transferFor(otherAccount, 100.0);

		System.out.println("Account name: " + myAccount.client);
		System.out.println("Actual balance: " + myAccount.balance);
		System.out.println("Account name: " + otherAccount.client);
		System.out.println("Actual balance: " + otherAccount.balance);

	}
}
