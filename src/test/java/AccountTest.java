

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Test;

public class AccountTest {

	@Test
	public void shouldReturnOneHundredForBalance() {
		// Arrange
		Account underTest = new Account(100);
		// Act
		int actual = underTest.checkBalance();
		// Assert
		assertEquals(100, actual);
	}
	
	@Test
	public void shouldReturnTwoHundredForBalance() {
		//Arrange
		Account underTest = new Account(200);
		//Act
		int actual = underTest.checkBalance();
		assertEquals(200, actual);
	}
	
	@Test
	public void shouldWithdraw() {
		// Arrange
		Account underTest = new Account(200);
		// Act
		int withdrawalAmount = underTest.withdraw(50); //returns the variable depositamt from deposit()
		// Assert
		assertEquals(50, withdrawalAmount);// should withdrawl 50
	} 
	@Test
	public void shouldDeposit() {
		//Arrange
		Account underTest = new Account(200);
		//Act
		int shouldDeposit = underTest.deposit(50); //returns the variable withdrawlamt from withdraw()
		//Assert 
		assertEquals(50, shouldDeposit);//should deposit 50
		
		
	}
	@Test
	public void shouldDecreaseWhenMoneyIsWithdrawn() {
		// Arrange
		Account underTest = new Account(200);
		// Act
		int originalBalance = underTest.checkBalance(); //create new variable originalBalance that is equal to checkbalance
		underTest.withdraw(50); //withdraw 150 as hardcoded in method withdraw
		int newBalance = underTest.checkBalance(); //create variable newBalance
		// Assert
		assertEquals(originalBalance - 50, newBalance); //should equal 150
		
	}
	
	@Test
	public void shouldIncreaseWhenMoneyIsDeposited() {
		// Arrange
		Account underTest = new Account(200);
		// Act
		int originalBalance = underTest.checkBalance(); //runs checkbalance method
		underTest.deposit(50); //runs deposit code (adds 50)
		int newBalance = underTest.checkBalance(); //runs balance code to check balance
		underTest.deposit(50);//runs deposit code again (so adds 50 more)
		newBalance = underTest.checkBalance(); //checks balance again
		// Assert
		System.out.println(newBalance);
		assertEquals(originalBalance + 100, newBalance);//should equal 30
	}
	
	@Test
	public void shouldIncreaseto300WhenUserEnters100() {
		// Arrange
		Scanner input = new Scanner(System.in);		
		System.out.println("How much would you like to deposit?(enter 100)");
		int deposit = input.nextInt();
		
		
		Account underTest = new Account(200);
				
				
				
		// Act
		int originalBalance = underTest.checkBalance(); //runs checkbalance method
		underTest.deposit(deposit); //runs deposit code (adds 50)
		int newBalance = underTest.checkBalance(); //runs balance code to check balance
		
		System.out.println(newBalance);
		assertEquals(originalBalance + 100, newBalance);//should equal 250
		
	}
	
	@Test
	public void shouldDecreaseto100WhenUserEnters50() {
		// Arrange
		Scanner input = new Scanner(System.in);		
		System.out.println("How much would you like to withdraw (enter 50 for test)?");
		int withdraw = input.nextInt();
		
		
		Account underTest = new Account(200);
				
				
				
		// Act
		int originalBalance = underTest.checkBalance(); //runs checkbalance method
		underTest.withdraw(withdraw); //runs deposit code (adds 50)
		int newBalance = underTest.checkBalance(); //runs balance code to check balance
		
		//assert
		System.out.println(newBalance);
		assertEquals(originalBalance - 50, newBalance);//should equal 150
		
	}
	
	@Test
	public void pinNumberShouldEqualwhateveruserenters() {
		//ACT
		Scanner input = new Scanner (System.in);
		System.out.println("Enter PIN. (user 1234");
		
		int pinNumber = input.nextInt();//enter PIN
		
		
		Account underTest = new Account(1234); //
		//ARRANGE
		int userPINreturn = underTest.checkPIN(pinNumber);//sets pin number in method
		
		assertEquals(pinNumber, userPINreturn);
		//ASSERT
	}
	
	@Test
	public void cannotwithdrawmorethanbalance() {
		//act
		Account underTest = new Account (200);
		
		//arrange
		int originalBalance = underTest.checkBalance(); //create new variable originalBalance that is equal to checkbalance
		underTest.withdraw(250); //withdraw 150 as hardcoded in method withdraw
		int newBalance = underTest.checkBalance(); //create variable newBalance
		
		//assert
		
		assertEquals(originalBalance, newBalance);
	}
	@Test
	public void shouldHaveAccountNumber() {
		//arrange
		
		Account underTest = new Account("0", 200); //hard coding an account number and initial balance
		String expected = underTest.getAccountNumber();
		
		//act
		assertEquals(expected, "0");
		
		//assert
	}
	
	@Test
	public void shouldBeAbletoAddBillPay() {
		//arrange
		BillPay underTest = new BillPay();
		String accToAdd = "AEP";
		
		
		//act
		int intialAccounts = underTest.getAccountsLength();
		underTest.addBillPayee(accToAdd);
		int accountsAfterAddition = underTest.getAccountsLength();
		
		System.out.println(underTest.getAccount(0));
		
		
		//assert
		assertEquals(intialAccounts + 1, accountsAfterAddition);
		
	}
}
