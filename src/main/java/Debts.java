
public class Debts {

	private String debtor;
	private String accountNumber;
	private int amount;
	
	
	
	public Debts(String debtor, String accountNumber, int amount) {
		this.debtor = debtor;
		this.accountNumber = accountNumber;
		this.amount = amount;
	}
	
	
	public String getDebtorName() {
		
		return debtor;
		
	}
	
	
	public int getDebit() {
		
		return amount;
	} 
	
public String getAccountNumber() {
		
		return accountNumber;
	}
	
	

}
