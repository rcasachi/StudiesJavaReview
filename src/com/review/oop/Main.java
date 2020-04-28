package com.review.oop;

public class Main {
    public static void main(String[] args) {
        Account johnDoe = new Account();
        johnDoe.accountNumber = 123;
        johnDoe.bankAgency = 1900;

        johnDoe.owner = new Person();
        johnDoe.owner.name = "John Doe";
        johnDoe.owner.documentNumber = "123456789-0";
        johnDoe.owner.birthDate = "11/01/1990";

        johnDoe.deposit(1000.0);

        Account janeDoe = new Account();
        janeDoe.accountNumber = 456;
        janeDoe.bankAgency = 1900;
        janeDoe.deposit(98.99);

        johnDoe.transfer(100.0, janeDoe);
    }
}
