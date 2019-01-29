import java.util.Collection;
import java.util.HashMap;

public class Atm {

	private HashMap<String, Account> accountslist = new HashMap<String, Account>();


	public void addAccount(Account accToAdd) {
		//Account acctToAdd = new Account("Checking", 200);
		accountslist.put(accToAdd.getAccountNumber(), accToAdd);
		
		//System.out.println(accountslist.values());
		
	}

	public HashMap<String, Account> getAccounts(){
		return accountslist;
		
	}
	
	public int getAccountsLength() {
		return accountslist.size();
		
	}

	public Account getAccount(String acctToGet) {
		
		return accountslist.get(acctToGet);
		//search the accounts map to see if it matches what the user enters
	}
	
	

	public void transfer(Account transferFrom, Account transferTo, int transferAmt) {
		
		transferFrom.withdraw(transferAmt);
		transferTo.deposit(transferAmt);
		//transfer amount is the amount of transfer the user enters
		
	}
}
