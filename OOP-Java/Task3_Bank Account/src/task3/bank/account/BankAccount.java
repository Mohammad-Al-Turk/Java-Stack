package task3.bank.account;

public class BankAccount {

	private double checkingBalance = 0;
    private double savingsBalance = 0;
    private static int accounts = 0;
    private static double totalMoney = 0;

    
    public BankAccount() {accounts++;    }
    
	public BankAccount(double checheckingBalance, double savingsBalance) {
	this.checkingBalance=checheckingBalance;
    this.checkingBalance=savingsBalance;
    accounts++;
    
    
	}

	
	public void Deposit(int deposit, String accountType) {
		if(accountType == "checkingBalance") {
		this.checkingBalance+=deposit;
		System.out.println("your balance in cheching: " + this.checkingBalance );
		totalMoney += deposit;
		}
		else if(accountType == "savingsBalance") {
			this.savingsBalance+=deposit;
			System.out.println("your balance in saving: " + this.savingsBalance);
			totalMoney += deposit;
		}
		
		else {
			
			System.out.println("You must select only a saving account or savings account.");
		}
	}
	
	
	
	
	
	public void Withdraw(int withdraw, String accountType) {
		if(accountType == "checkingBalance" && this.checkingBalance >= withdraw && withdraw>0) {
			this.checkingBalance-=withdraw;
			totalMoney += withdraw;
			System.out.println("your balance in cheching: " + this.checkingBalance );
			}
			else if(accountType == "savingsBalance" && this.savingsBalance >= withdraw && withdraw>0) {
				this.savingsBalance-=withdraw;
				totalMoney += withdraw;
				System.out.println("your balance in saving: " + this.savingsBalance);
			}
			else {
				System.out.println("You must select only a checking account or savings account and Make sure you have enough money..");
			}
			
		}
	

	
	public double getBalance() {
        return this.checkingBalance + this.savingsBalance;
    }
	
	
	
	public double getCheckingBalance() {
		return checkingBalance;
	}


	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}


	public double getSavingsBalance() {
		return savingsBalance;
	}


	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}


	public static int getAccounts() {
		return accounts;
	}


	public static void setAccounts(int accounts) {
		BankAccount.accounts = accounts;
	}


	public static double getTotalMoney() {
		return totalMoney;
	}


	public static void setTotalMoney(double totalMoney) {
		BankAccount.totalMoney = totalMoney;
	}
	
}
