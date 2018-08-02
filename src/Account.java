/*
 * The purpose of this program is to set up a simple bank account program
 * utilizing multiple classes. The first class will have the account information/classes
 * Author:Clarissa Mercado
 * Date: 8-01-18
 */
public class Account {
	
	//class attributes
	String name;
	int accountNum;
	String accountType;
	private double balance;
	double amount;
	
	// Account object constructor
	public Account(String name, int accountNum, String accountType, double balance) {
		this.name = name;
		this.accountNum = accountNum;
		this.accountType = accountType;
		balance = 0.0;
	}
	 //"Deposit" method for object attribute
	public void deposit (double amount) {
		balance = balance + amount;
	}
	
	//"withdraw" method for object attribute
	public void withdraw(double amount) {
		if (amount <= balance) {
			balance = balance - amount;
		}
		else {
			System.out.println("Cannot compelte transaction.");
		}
	}
	//getting final number for attribute balance of the object
	public double getBalance() {
		return balance;
	}
	
}
