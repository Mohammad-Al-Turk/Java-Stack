package task3.bank.account;

public class BankTest {
    public static void main(String[] args){
        
    	BankAccount account1 = new BankAccount();
    	account1.Deposit(510,"checkingBalance");
    	account1.Deposit(510,"savingsBalance");
    	account1.Withdraw(10,"checkingBalance");
    	account1.Withdraw(10,"savingsBalance");
    	account1.Deposit(500,"checkingBalance");
    	account1.Deposit(500,"savingsBalance");
    	account1.Deposit(500,"guest");
    	System.out.println(account1.getBalance());
    	System.out.println("Total Bank Accounts: " + BankAccount.getAccounts());
        System.out.println("Total Money in Bank: " + BankAccount.getTotalMoney());
    	
    	
    	System.out.println("---------------------------");
    	
    	BankAccount account2 = new BankAccount();
    	account2.Deposit(500,"checkingBalance");
    	account2.Deposit(500,"savingsBalance");
    	account2.Deposit(500,"checkingBalance");
    	account2.Deposit(500,"savingsBalance");
    	account2.Deposit(500,"guest");
    	System.out.println(account2.getBalance());
    	System.out.println("Total Bank Accounts: " + BankAccount.getAccounts());
        System.out.println("Total Money in Bank: " + BankAccount.getTotalMoney());
    	
    	

        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        // - each deposit should increase the amount of totalMoney

        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney

        // Static Test (print the number of bank accounts and the totalMoney)

    }
}