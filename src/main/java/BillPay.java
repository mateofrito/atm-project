import java.util.ArrayList;
import java.util.HashMap;

public class BillPay {
	
	private ArrayList<String>billPayees = new ArrayList<>();
	
public BillPay() {
		// TODO Auto-generated constructor stub
	}
		

	public BillPay(String newPayee) {
		return;
	// TODO Auto-generated constructor stub
}


	public void addBillPayee(String newPayee) {
		billPayees.add(newPayee);
	}
	
	public int getAccountsLength() {
		return billPayees.size();
	}
	public String getAccount(int bp) {
		return billPayees.get(bp);
		
	
		
	}

	

}
