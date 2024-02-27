package com.shoppingapp.application;

import com.shoppingapp.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {

    private static float Charges ;

//    PrimeAcc Atharv = new GSPrimeAcc();
    public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
        super(accNo, accNm, charges, isPrime);
    }

    @Override
    public void bookProduc(float amount) {

    }

    @Override
    public void items(float itemCount) {

    }

}
