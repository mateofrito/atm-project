import java.util.ArrayList;
import java.util.HashMap;

public class Transactions {

	private HashMap<String, Debts> transJournal = new HashMap<String, Debts>();
	
	public Transactions(String debtor, String accountNum, int amount) {
	}

	public Transactions() {
		this.transJournal = transJournal;
		// TODO Auto-generated constructor stub
	}

	public void addTransaction(Debts transactions) {
		transJournal.put(transactions.getDebtorName(), transactions);
		
	}
	
	
	public HashMap<String, Debts> getTransactions(){
		return transJournal;
	}
	
	
	
	

}
