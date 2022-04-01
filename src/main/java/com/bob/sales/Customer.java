package com.bob.sales;

import java.util.SplittableRandom;

public class Customer {
    String number;
    int price;

    public Customer(String number,int price){
        this.number=number;
        this.price=price;

    }
    public int getmoney(){
        return (price/1000)*100;
    }
    public void print(){
        if(price>1000){
            System.out.print(number+"\t"+price+"\t"+(price-getmoney()));
        }
        else{
            System.out.print(number+"\t"+price+"\t"+price);
        }

        System.out.println();

    }

}
