
public class Retirement extends Account {

	public Retirement(String string, int balance) {
		super(string, balance);
		// TODO Auto-generated constructor stub
	}

	public Retirement(int balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}
	public int withdraw(int withdraw) {
		int withdrawalamt = 0;
		System.out.println("Unable to perform withdrawal on Retirement Accounts.\nHowever, you can adjust your contributions.");
		return withdrawalamt;
		} 
}


