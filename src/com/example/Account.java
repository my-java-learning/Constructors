package com.example;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public Account(){
        System.out.println("Empty constructor called");
    }

    public Account(String number, double balance, String customerName, String customerEmail, String customerPhoneNumber){
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
        System.out.println("Constructor with parameters called");
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void depositFunds(double funds){
        this.balance += funds;
        System.out.println("Deposit of " + String.format("%.2f", funds) + "$ " + "successful, balance set to: "
                + String.format("%.2f", this.balance) + "$");
    }

    public void withdrawFunds(double funds){
        if(this.balance-funds < 0){
            System.out.println("Can't withdraw " + String.format("%.2f", funds) + "$"
                    + ", account balance too low, actual balance is: " + String.format("%.2f", this.balance) + "$");
        } else {
            this.balance -= funds;
            System.out.println("Withdraw of " + String.format("%.2f", funds) + "$ "
                    + "successful, balance set to: " + String.format("%.2f", this.balance) + "$");
        }
    }
}
