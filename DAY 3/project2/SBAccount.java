package com.project2;

class SBAccount extends Account {

    String accountType; // Normal / NRI

    @Override
    double calculateInterest() throws InvalidInputException {

        if (amount < 0)
            throw new InvalidInputException("Invalid amount. Please enter correct values.");

        if (accountType.equalsIgnoreCase("Normal"))
            interestRate = 4;
        else if (accountType.equalsIgnoreCase("NRI"))
            interestRate = 6;
        else
            throw new InvalidInputException("Invalid account type.");

        return (amount * interestRate) / 100;
    }
}
