package com.shoppingapp.application;

import com.shoppingapp.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {
    public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
        super(accNo, accNm, charges, deliveryCharges);
    }

    @Override
    public void bookProduc(float amount) {
//        super.bookProduc(amount);
    }

    @Override
    public void items(float itemCount) {

    }

    @Override
    public String toString() {
        return "GSNormalAcc [getDeliveryCharges()=" + getDeliveryCharges()
                + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getCharges()=" + getCharges()
                + "]";

    }
}
