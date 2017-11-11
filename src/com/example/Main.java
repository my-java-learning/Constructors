package com.example;

public class Main {

    public static void main(String[] args) {
	    Account account = new Account();
	    account.depositFunds(1000);
	    account.withdrawFunds(500);
	    account.withdrawFunds(500);
		account.withdrawFunds(50);
    }
}
