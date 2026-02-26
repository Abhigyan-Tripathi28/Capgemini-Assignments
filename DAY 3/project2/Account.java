package com.project2;

abstract class Account {
    double interestRate;
    double amount;

    abstract double calculateInterest() throws InvalidInputException;
}
