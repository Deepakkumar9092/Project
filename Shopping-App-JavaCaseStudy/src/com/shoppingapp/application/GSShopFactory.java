package com.shoppingapp.application;

import com.shoppingapp.framework.ShopFactory;

public class GSShopFactory extends ShopFactory {

//    ShopFactory Wrangler = new GSShopFactory();
    @Override
    public GSPrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
        return new GSPrimeAcc(accNo, accNm, charges, isPrime);
    }

    @Override
    public GSNormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
        return new GSNormalAcc(accNo, accNm, charges, deliveryCharges);
    }

}
