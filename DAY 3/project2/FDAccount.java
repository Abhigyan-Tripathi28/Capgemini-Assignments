package com.project2;

class FDAccount extends Account {

    int noOfDays;
    int ageOfACHolder;

    @Override
    double calculateInterest() throws InvalidInputException {

        if (amount < 0 || noOfDays < 0 || ageOfACHolder < 0)
            throw new InvalidInputException("Invalid Number of days. Please enter correct values.");

        if (amount < 10000000) { // Below 1 crore

            if (noOfDays >= 7 && noOfDays <= 14)
                interestRate = (ageOfACHolder >= 60) ? 5.00 : 4.50;
            else if (noOfDays <= 29)
                interestRate = (ageOfACHolder >= 60) ? 5.25 : 4.75;
            else if (noOfDays <= 45)
                interestRate = (ageOfACHolder >= 60) ? 6.00 : 5.50;
            else if (noOfDays <= 60)
                interestRate = (ageOfACHolder >= 60) ? 7.50 : 7.00;
            else if (noOfDays <= 184)
                interestRate = (ageOfACHolder >= 60) ? 8.00 : 7.50;
            else
                interestRate = (ageOfACHolder >= 60) ? 8.50 : 8.00;

        } else { // Above 1 crore

            if (noOfDays <= 14)
                interestRate = 6.50;
            else if (noOfDays <= 29)
                interestRate = 6.75;
            else if (noOfDays <= 45)
                interestRate = 6.75;
            else if (noOfDays <= 60)
                interestRate = 8.00;
            else if (noOfDays <= 184)
                interestRate = 8.50;
            else
                interestRate = 10.00;
        }

        return (amount * interestRate) / 100;
    }
}
