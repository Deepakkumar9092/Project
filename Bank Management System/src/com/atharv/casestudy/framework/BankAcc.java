package com.atharv.casestudy.framework;

abstract class BankAcc {
    private int accNo;
    private String accNm;
    protected float accBal;

    public BankAcc(int accNo, String accNm, float accBal) {
        this.accNo = accNo;
        this.accNm = accNm;
        this.accBal = accBal;
    }

    public abstract void withdraw(float amount);

    public void deposit(float amount) {
        accBal += amount;
    }

    @Override
    public String toString() {
        return "Account Number: " + accNo + "\nAccount Name: " + accNm + "\nAccount Balance: " + accBal;
    }
}