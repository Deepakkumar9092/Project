package com.atharv.casestudy.framework;

public abstract class SavingAcc extends BankAcc {
    private boolean isSalaried;
    protected static final float MINBAL = 1000;

    public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
        super(accNo, accNm, accBal);
        this.isSalaried = isSalaried;
    }

    @Override
    public void withdraw(float amount) {
        if (accBal - amount >= MINBAL) {
            accBal -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + accBal);
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nIs Salaried: " + isSalaried;
    }
}

