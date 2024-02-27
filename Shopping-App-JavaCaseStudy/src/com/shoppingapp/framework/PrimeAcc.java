package com.shoppingapp.framework;

public abstract class PrimeAcc extends ShopAcc{

    private boolean isPrime;
    private static final float deliveryCharges = 80;
    public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
        super(accNo, accNm, charges);
        this.isPrime = isPrime;
    }

    public boolean isPrime() {
        return isPrime;
    }

    public void setisPrime(boolean prime) {
        isPrime = prime;
    }
    public static float getDeliveryCharges(){
        return deliveryCharges;
    }

    @Override
    public String toString() {
        return "PrimeAcc:" +
                "isPrime=" + isPrime + "AccNo: " + getAccNo() + ", AccNm: " + getAccNm() + " Charges: "+ getCharges()+"}";
    }
}
