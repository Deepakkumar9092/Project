package com.atharv.casestudy.framework;

public abstract class CurrentAcc extends BankAcc {
    private final float creditLimit;

    public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
        super(accNo, accNm, accBal);
        this.creditLimit = creditLimit;
    }

    @Override
    public void withdraw(float amount) {
        if (accBal + creditLimit >= amount) {
            accBal -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + accBal);
        } else {
            System.out.println("Cannot withdraw beyond credit limit.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nCredit Limit: " + creditLimit;
    }
}