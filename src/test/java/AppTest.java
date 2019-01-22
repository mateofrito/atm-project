

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Test;

public class AppTest {

	@Test
	public void shouldReturnOneHundredForBalance() {
		// Arrange
		Atm underTest = new Atm(100);
		// Act
		int actual = underTest.checkBalance();
		// Assert
		assertEquals(100, actual);
	}
	
	@Test
	public void shouldReturnTwoHundredForBalance() {
		//Arrange
		Atm underTest = new Atm(200);
		//Act
		int actual = underTest.checkBalance();
		assertEquals(200, actual);
	}
	
	@Test
	public void shouldWithdraw() {
		// Arrange
		Atm underTest = new Atm(200);
		// Act
		int withdrawalAmount = underTest.withdraw(50); //returns the variable depositamt from deposit()
		// Assert
		assertEquals(50, withdrawalAmount);// should withdrawl 50
	} 
	@Test
	public void shouldDeposit() {
		//Arrange
		Atm underTest = new Atm(200);
		//Act
		int shouldDeposit = underTest.deposit(50); //returns the variable withdrawlamt from withdraw()
		//Assert 
		assertEquals(50, shouldDeposit);//should deposit 50
		
		
	}
	@Test
	public void shouldDecreaseWhenMoneyIsWithdrawn() {
		// Arrange
		Atm underTest = new Atm(200);
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
		Atm underTest = new Atm(200);
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
		
		
		Atm underTest = new Atm(200);
				
				
				
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
		
		
		Atm underTest = new Atm(200);
				
				
				
		// Act
		int originalBalance = underTest.checkBalance(); //runs checkbalance method
		underTest.withdraw(withdraw); //runs deposit code (adds 50)
		int newBalance = underTest.checkBalance(); //runs balance code to check balance
		
		//assert
		System.out.println(newBalance);
		assertEquals(originalBalance - 50, newBalance);//should equal 150
		
	}
	
	@Test
	public void pinNumberShouldEqualonetwothreefour() {
		//ACT
		Atm underTest = new Atm(1234);
		
		int userPIN = underTest.checkPIN();
		
		//ARRANGE
		
		assertEquals(userPIN, 1234);
		//ASSERT
	}
	
	@Test
	public void cannotwithdrawmorethanbalance() {
		//act
		Atm underTest = new Atm (200);
		
		//arrange
		int originalBalance = underTest.checkBalance(); //create new variable originalBalance that is equal to checkbalance
		underTest.withdraw(250); //withdraw 150 as hardcoded in method withdraw
		int newBalance = underTest.checkBalance(); //create variable newBalance
		
		//assert
		
		assertEquals(originalBalance, newBalance);
	}
	
	
}
