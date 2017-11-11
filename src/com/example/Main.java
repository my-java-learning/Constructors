package com.example;

public class Main {

    public static void main(String[] args) {
	    Account account = new Account();
	    account.setBalance(0);
	    account.setCustomerEmail("example.account@gmail.com");
	    account.setCustomerName("Name");
	    account.setCustomerPhoneNumber("666666666");
	    account.setNumber("12345");
	    account.depositFunds(1000);
	    account.withdrawFunds(500);
	    account.withdrawFunds(500);
		account.withdrawFunds(50);

		Account secondAccount = new Account("123456" , 100 , "Name2" , "example.account2@gmail.com" , "777777777");
		secondAccount.depositFunds(1000);
		secondAccount.withdrawFunds(500);
		secondAccount.withdrawFunds(1500);
    }
}
