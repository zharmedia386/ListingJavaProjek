package iniPackage;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class JUnit_Testing{
	int AccountNumber = 12345;
	boolean userAuthenticated = false;
	
	@Test
	public void test() {
		// TESTING LOGIN
		BankDatabase bankDatabase = new BankDatabase();
		assertFalse(userAuthenticated);
		userAuthenticated = bankDatabase.authenticateUser(AccountNumber, 54321);
		assertTrue(userAuthenticated);
		
		// TESTING BALANCE
		Screen screen = new Screen(); 
		BalanceInquiry balance = new BalanceInquiry(AccountNumber,screen, bankDatabase);
		assertEquals(1000.0,balance.getBankDatabase().getAvailableBalance(AccountNumber),0.0);
		assertEquals(1200.0,balance.getBankDatabase().getTotalBalance(AccountNumber),0.0);
		balance.execute();
		
		// TESTING WITHDRAWAL
		Keypad keypad = new Keypad();
		CashDispenser cashDispenser = new CashDispenser();
		Withdrawal withdrawal = new Withdrawal(AccountNumber,screen,bankDatabase,keypad,cashDispenser);
		assertSame(bankDatabase,withdrawal.getBankDatabase());
		withdrawal.execute();
		assertEquals(AccountNumber,withdrawal.getAccountNumber());
		
		// TESTING BALANCE INFORMATION
		BalanceInquiry Balance = new BalanceInquiry(AccountNumber,screen, bankDatabase);
		assertEquals(800.0,Balance.getBankDatabase().getAvailableBalance(AccountNumber),0.0);
		assertEquals(1000.0,Balance.getBankDatabase().getTotalBalance(AccountNumber),0.0);
		Balance.execute();
		
	}
}
