package Clases_Objetos;

/**
 * Creation of the bank account class with its attributes and methods.
 * @author LAURA ALBA GONZALEZ
 *
 */

public class Bank_Account {
	
	private int accountNumber;
	protected boolean activated;
	/**
	 * 
	 * @param accountNumber.This parameter is the account number
	 * @param activated. This parameter activates the account number
	 */
	public Bank_Account (int accountNumber, boolean activated) {
		this.accountNumber= accountNumber;
		this.activated= activated;
	}
	public Bank_Account() {
		
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber= accountNumber;
	}
	
	public void setActivated(boolean activated) {
		this.activated= activated;
	}
	/**
	 * Returns the account number
	 * @return
	 */
	public int getAccountNumber() {
		return accountNumber;
	}
	/**
	 * Returns the status of the card
	 * @return
	 */
	public boolean getActivated() {
		return activated;
	}

}
