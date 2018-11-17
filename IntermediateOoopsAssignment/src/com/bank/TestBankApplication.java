package com.bank;

import com.employee.Employee;


public class TestBankApplication {
/*public static void testBankAccountMethod(){
	BankAccount acc= new BankAccount();
	acc.setAccountHolderName("Sachin");
	
}*/
public static void testSavingAccount(){
	SavingsAccount savacc= new SavingsAccount("deva",5000,50000);
	System.out.println("Account name is:"+savacc.getAccountHolderName());
	System.out.println("Account no is:"+savacc.getAccountNo());
	
	System.out.println("Account Balance after deposit "+savacc.getAccountBalance());
	System.out.println("Account Balance after withdraw "+savacc.getAccountBalance());
}
public static void testCurrentAccount(){
	CurrentAccount curacc= new CurrentAccount("chandu",40000);
	System.out.println("Account name is:"+curacc.getAccountHolderName());
	System.out.println("Account no is:"+curacc.getAccountNo());

	System.out.println("Account Balance after deposit "+curacc.getAccountBalance());
	System.out.println("cash credit Balance after withdraw "+curacc.getcashCredit());
}
public static void main(String args[]){
	//testBankAccountMethod();
	testCurrentAccount();
	double cash=Employee.getTotalSalaryOfAllEmployees();
	System.out.println(cash);
	//testSavingAccount();
}
	
}
