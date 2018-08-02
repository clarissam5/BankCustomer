/*
 * Creating objects for the simple bank account exercise
 * Author:Clarissa Mercado
 * Date: 8-01-18
 */
public class Bank {
	
	//Created two objects
	public static void main(String args[]) {
		//String name, int accountNum, String accountType, double balance
		Account cust1 = new Account ("Leena Brown", 47839, "Checkings", 0.0);
			cust1.deposit(1000);
			cust1.withdraw(396.04);
			printInfo(cust1);
		
		Account cust2 = new Account ("John Smith", 59372, "Savings", 0.0);
			cust2.deposit(453.11);
			cust2.withdraw(23.99);
			printInfo(cust2);

		System.out.println("The number of customers: " + 2);
	}
	
	//created method to print created object parameters/info
	public static void printInfo(Account a) {
		
		System.out.println("Name: "+ a.name);

		System.out.println("Account Number: " + a.accountNum);
		
		System.out.println("Type of Account: " + a.accountType);

		System.out.println("Your Current Balance is: " + a.getBalance());
	}

}
