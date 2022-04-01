package com.bob.sales;

public class GoldenCustomer extends SliverCustomer{
    public GoldenCustomer(String number,int price){
        super(number, price);
    }

    @Override
    public int getpayback() {
        return price/10;
    }

    @Override
    public int getmoney() {
        return price/10;
    }

}
