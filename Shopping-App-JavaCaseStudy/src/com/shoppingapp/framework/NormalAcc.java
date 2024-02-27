package com.shoppingapp.framework;

public abstract class NormalAcc extends ShopAcc{

    private final float deliveryCharges = 80;

    public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
        super(accNo, accNm, charges);
//        this.deliveryCharges = deliveryCharges;
    }

    public float getDeliveryCharges() {
        return deliveryCharges;
    }

    public void bookProduct(float amount){

     }

    @Override
    public String toString() {
        return "NormalAcc [deliveryCharges=" + deliveryCharges + ", getDeliveryCharges()=" + getDeliveryCharges()
                + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getCharges()=" + getCharges()
                + ", toString()=" + super.toString() + ", getClass()=" + getClass() + "]";
    }
}
