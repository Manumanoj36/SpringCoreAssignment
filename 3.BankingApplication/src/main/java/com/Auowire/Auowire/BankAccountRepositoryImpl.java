package com.Auowire.Auowire;


public abstract class BankAccountRepositoryImpl implements BankAccountRepository {
	
	private void BankAccountRepositoryImpl(){
	  BankAccount bankaccount = new BankAccount();
	  bankaccount.setAccountHolderName("Saikumar");
	  bankaccount.setAccountId(899);
	  bankaccount.setAccountType("Savings");
	  bankaccount.setAccountBalance((long) 20500.20);


	}
}
