package com.Q9;

public abstract class BankAccount {
	//static variable
	
	
	//instance variables/class variable/these variables existence depends upon object or instance
     protected int accountNo;
     protected String accountHolderName;
     protected double accountBalance;


public BankAccount(){ //default constructor
	//constructor is used to initialize instance variables
	accountHolderName="unknow";
	accountBalance= 0;
}
public BankAccount(int accno,String accountHolderName,double accountBalance){//Parameterized constructor
	//constructor is used to initialize instance variables
	this.accountHolderName=accountHolderName;
	this.accountNo=accno;
	this.accountBalance= accountBalance;
}

public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;//Setters are used for modifying or reinitializing  the member variables
}
//getter methods
public double getAccountBalance() {
	return accountBalance;
}
public String getAccountHolderName() {
	return accountHolderName;
}
public int getAccountNo() {
	return accountNo;
}
//service methods
public abstract void withdraw(double amount);



public void deposit(double amount){
	if(amount<=0){
		
		System.out.println("Enter valid amount");
	}
	else{
	this.accountBalance+=amount;
	}
}
@Override
public String toString() {
	return "BankAccount [accountNo=" + accountNo + ", accountHolderName="
			+ accountHolderName + ", accountBalance=" + accountBalance + "]";
}

}

