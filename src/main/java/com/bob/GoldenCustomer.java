package com.bob;

public class GoldenCustomer extends Customer{
    public GoldenCustomer(String number,int price){
        super(number, price);
    }
    public void print(){
        if (price > 1000) {
            int money = (price / 1000) * 200;
            int payback = (price / 1000) * 200;
            System.out.print( number +"\t"+ price+"\t"+ (price - money) + "\t"+"(" + payback+")");
        }
        else{
            System.out.print(number+"\t"+price);
        }
        System.out.println();
    }
}
