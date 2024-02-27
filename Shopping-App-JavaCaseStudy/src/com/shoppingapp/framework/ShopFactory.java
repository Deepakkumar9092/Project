package com.shoppingapp.framework;

abstract public class ShopFactory {

    abstract public PrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isPrime);
    abstract public NormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float deliveryCharges);
}
