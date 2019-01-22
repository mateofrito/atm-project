
public class Atm {
	
	private int balance;
	private int deposit;
	private int withdraw;
	private int pinNumber;
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//	
	public Atm(int balance) {
		this.balance = balance;
		
	}

	public int checkBalance() {
		
		return balance;
	}

	public int withdraw(int withdraw) {
		this.withdraw = withdraw;
		int withdrawalamt = withdraw;
		//if statement ensures withdrawal amount cannot exceed current balance
		if(withdraw > balance) {
			return balance;
		}else {
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
		this.pinNumber = pinNumber;
		int PIN = pinNumber;
		// TODO Auto-generated method stub
		return pinNumber;
	}

}
