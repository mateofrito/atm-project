
public class Account {
	
	private int balance;
	private int deposit;
	private int withdraw;
	private int pinNumber;
	//private string exitMsg;
	private String accountNumber;
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
	
	//constructors
	public Account(String string, int balance) {

		this.accountNumber = string;
		this.balance = balance; 
		

		
		
	}
	public Account(int balance) {
		this.balance = balance;
//	
	
		
		
	}

	//getters
	public int checkBalance() {
		return balance;
	}

	public int withdraw(int withdraw) {
		this.withdraw = withdraw;
		int withdrawalamt = withdraw;
		//if statement ensures withdrawal amount cannot exceed current balance
		if(withdraw > balance)//returns the balance amount to an if statement in the application class
			{
			return balance;
		}else //returns the withdrawal amount to process the withdraw
		{
		balance -= withdrawalamt; //balance = balance - withdrawalamt
		return withdrawalamt;
		} 
}

	public int deposit(int deposit) {
		// TODO Auto-generated method stub
		this.deposit = deposit;
		int depositamt = deposit;
		balance += depositamt;
		return depositamt;
		
	}

	public int checkPIN(int pinNumber) {
		//this.pinNumber = pinNumber;
		int PIN = pinNumber;
		return pinNumber;
	}

	public String getAccountNumber() {
		
		return accountNumber;
	} 
		
//		private String exitMessage(String exitMsg) {
//			this.exitMsg = "Thank you for choosing the Fry National Bank! /n Visit us on the web at www.frybank.com.  Download our app!";
//			//System.exit(0);
//			return ExitMsg;
//		}
//	

}
