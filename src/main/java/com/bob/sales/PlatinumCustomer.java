package com.bob.sales;

public class PlatinumCustomer extends GoldenCustomer{
    public PlatinumCustomer(String number,int price){
        super(number, price);
    }

    @Override
    public int getpayback() {
        return super.getpayback()*2;
    }

    @Override
    public int getmoney() {
        return super.getmoney()*3;
    }
}
