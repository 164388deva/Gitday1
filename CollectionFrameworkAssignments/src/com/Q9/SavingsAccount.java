package com.Q9;




public class SavingsAccount extends BankAccount{
@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", accountHolderName="
			+ accountHolderName + ", accountBalance=" + accountBalance + "  isSalaryAccount=" + isSalaryAccount + "]\n";
	}
private boolean isSalaryAccount;
public SavingsAccount(){
this.isSalaryAccount=true;
}
public boolean issalaryAccount() {
	return this.isSalaryAccount;
}
public SavingsAccount(int accno,String accountHolderName,double amount){
	super(accno, accountHolderName,amount);
	this.isSalaryAccount=true;
}
public SavingsAccount(int accno,String accountHolderName,double amount,boolean isSalaryAccount){
	super(accno,accountHolderName,amount);
	this.isSalaryAccount=isSalaryAccount;
}
public void withdraw(double amount){
	this.accountBalance-=amount;
	
}
	
}

