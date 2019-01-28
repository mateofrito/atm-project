import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

import atm.Account;

public class AtmTest {
	@Test
	public void shouldBeAbletoAddAccount() {
		//arrange
		Atm underTest = new Atm();
		Account accToAdd = new Account("1", 200);
		//act
		
		int initialAccounts = underTest.getAccountsLength();
		underTest.addAccount(accToAdd); //add account to ATM instance
		int accountsAfterAddition = underTest.getAccountsLength();//create object just to verify that the accounts increased
		
		//assert
		assertEquals(initialAccounts + 1 ,accountsAfterAddition); //check that there is a new account in the ATM
		
	}
	
	@Test
	public void shouldGetSingleAccount() {
		//Arrange
		
		Atm underTest = new Atm();
		Account accToAdd = new Account("1", 200);
		
		//Act
		underTest.addAccount(accToAdd); //add an account to underTest so we can get it
		Account actual = underTest.getAccount("1");
		
		System.out.println(accToAdd);
		System.out.println(actual);
		
		assertEquals(accToAdd, actual);
		
		
		
		//Assert
	}
	
	@Test
	public void shouldTransferAnyAmountBetweenAccounts() {
		Scanner input = new Scanner(System.in);
		
		Atm atmtableTest = new Atm();
		
		
		
		atmtableTest.addAccount(new Account("1", 100));
		atmtableTest.addAccount(new Account("2", 200));
		System.out.println("Your new account balances are as follows: ");
		for (Account account : atmtableTest.getAccounts().values()){
			System.out.println(account.getAccountNumber() + " current balance: " + account.checkBalance());
		}
		
		
		//arrange
		System.out.println("Enter an Account Number (enter 1)");
		String userAccountFrom = input.nextLine();
		Account transferFrom = (atmtableTest.getAccount(userAccountFrom));
		System.out.println("Enter the account number you want to transfer to (enter 2)");
		String userAccountTo = input.nextLine();
		Account transferTo = (atmtableTest.getAccount(userAccountTo));
		
		System.out.println("How much would you like to transfer?");
		int transferAmount = input.nextInt();
	
		
		
		//Act
		Atm underTest = new Atm();
		
		
		underTest.transfer(transferFrom,transferTo, transferAmount);
		//send the accounts that need to transfer to and from and the amount of transfer
		System.out.println("Your new account balances are as follows: ");
		for (Account account : atmtableTest.getAccounts().values()){
			System.out.println(account.getAccountNumber() + " current balance: " + account.checkBalance());
		}
		//
		
		
		//assert
		assertEquals(50, transferFrom.checkBalance());
		assertEquals(250, transferTo.checkBalance());
		
	}
		
		
			
			
			
		}
	
	
	
	
}

