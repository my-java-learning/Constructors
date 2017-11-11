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

		VipCustomer vipCustomer1 = new VipCustomer();
		System.out.println(vipCustomer1.getCreditLimit());
		System.out.println(vipCustomer1.getEmail());
		System.out.println(vipCustomer1.getName());
		VipCustomer vipCustomer2 = new VipCustomer("Second name" , "Second email");
		System.out.println(vipCustomer2.getCreditLimit());
		System.out.println(vipCustomer2.getEmail());
		System.out.println(vipCustomer2.getName());
		VipCustomer vipCustomer3 = new VipCustomer("Third name" , 15000 , "Third email");
		System.out.println(vipCustomer3.getCreditLimit());
		System.out.println(vipCustomer3.getEmail());
		System.out.println(vipCustomer3.getName());
    }
}
