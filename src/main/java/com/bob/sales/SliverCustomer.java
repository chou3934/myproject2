package com.bob.sales;

public class SliverCustomer extends Customer{
    public SliverCustomer(String number,int price) {
        super(number, price);

    }
    public int getpayback(){
        return (price / 1000) * 100;
    }


    public void print(){
        if (price > 1000) {
            System.out.print( number +"\t"+ price+"\t"+ (price - getmoney()) + "\t"+"(" + getpayback()+")");
        }
        else{
            System.out.print(number+"\t"+price+"\t"+price);
        }
        System.out.println();
    }
}

