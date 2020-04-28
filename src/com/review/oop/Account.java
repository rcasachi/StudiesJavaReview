package com.review.oop;

public class Account {
    public int accountNumber;
    public double balance;
    public int bankAgency;
    public Person owner;

    /**
     * Deposit a value at the account balance
     * @param value
     */
    void deposit(double value) {
        this.balance += value;
    }

    /**
     * Withdraw a value from the account balance
     * @param value
     */
    void withdraw(double value) {
        if(this.balance >= value) {
            this.balance -= value;
        }
    }

    /**
     * Transfer a value from this account to another one
     * @param value
     * @param to
     */
    void transfer(double value, Account to) {
        this.balance -= value;
        to.balance += value;
    }
}
